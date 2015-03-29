package com.sapphire.blocks;

import java.util.Random;

import com.sapphire.dimension.TeleporterSapphire;
import com.sapphire.dimension.dimensionRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SapphirePortal extends BlockPortal {
	
	public SapphirePortal(){
		super();
		this.setCreativeTab(SapphireBlocks.sapphireTab);
	}
	
	/*public void updateTick(World world, int x, int y, int z, Random rand){
		
	}*/
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){
		return null;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
		
		byte b0 = 0;
		byte b1 = 1;
		
		if(world.getBlock(x - 1, y, z) == SapphireBlocks.sapphireOre || world.getBlock(x + 1, y, z) == SapphireBlocks.sapphireOre){
			b0 = 1;
			b1 = 0;
		}
		
		int i1;
		
		for(i1 = y; world.getBlock(x, i1 - 1, z) == this; --i1){
			;
		}
		if(world.getBlock(x, i1 - 1, z) != SapphireBlocks.sapphireOre){
			world.setBlockToAir(x, y, z);
		}else{
			int j1;
			
			for(j1 = 1; j1 < 4 && world.getBlock(x, i1 + j1, z) == this; ++j1){
				;
			}
			if(j1 == 3 && world.getBlock(x, i1 + j1, z) == SapphireBlocks.sapphireOre){
				boolean flag = world.getBlock(x - 1, y, z) == this || world.getBlock(x + 1, y, z) == this;
				boolean flag1 = world.getBlock(x, y, z - 1) == this || world.getBlock(x, y, z - 1) == this;
				
				if(flag && flag1){
					world.setBlockToAir(x, y, z);
				}else{
					if((world.getBlock(x+b0, y, z+b1) != SapphireBlocks.sapphireOre || world.getBlock(x-b0, y, z-b1) != this) && (world.getBlock(x-b0, y, z-b1) !=SapphireBlocks.sapphireOre || world.getBlock(x+b0, y, z+b1) != this)){
						world.setBlockToAir(x, y, z);
					}
				}
			}else{
				world.setBlockToAir(x, y, z);
			}
		}
	}
	
	public int quantityDropped(Random rand){
		return 0;
		
	}
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP){
			EntityPlayerMP thePlayer = (EntityPlayerMP) entity;
			
			MinecraftServer server = MinecraftServer.getServer();
			if(entity instanceof EntityPlayerMP){
				if(thePlayer.timeUntilPortal > 0){
					thePlayer.timeUntilPortal = 10;
					
				}else if(thePlayer.dimension != dimensionRegistry.dimensionId){
					thePlayer.timeUntilPortal = 10;
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dimensionRegistry.dimensionId, new TeleporterSapphire(server.worldServerForDimension(dimensionRegistry.dimensionId)));
					
				}else{
					thePlayer.timeUntilPortal = 10;
					thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterSapphire(server.worldServerForDimension(0)));
				}
				
			}
			
		}
	}
	
	public boolean tryTroCreatePortal(World world, int x, int y, int z){
		byte b0 = 0;
		byte b1 = 0;
		if(world.getBlock(x - 1 , y, z) == SapphireBlocks.sapphireOre || world.getBlock(x + 1, y, z) == SapphireBlocks.sapphireOre){
			b0 = 1;
		}
		
		if (world.getBlock(x, y, z - 1) == SapphireBlocks.sapphireOre || world.getBlock(x, y, z + 1) == SapphireBlocks.sapphireOre){
			b1 = 1;
		}
		
		if(b0 == b1){
			return false;
			
		}
		else{
			if(world.getBlock(x - b0, y, z - b1) == Blocks.air){
				x -= b0;
				z -= b1;
					
			}
			int l;
			int i1;
			for(l = -1; l <= 2; ++l){
				for(i1 = -1; i1 <= 3; ++i1){
					boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
					if( l != -1 && l != 2 || i1 != -1 && i1 !=3){
						Block j1 = world.getBlock(x + b0 * l, y + i1, z + b1 * l);
								if(flag){
									if(j1 != SapphireBlocks.sapphireOre){
										return false;
									}
								}
								else if(j1 != Blocks.air && j1 != Blocks.fire){
									return false;
								}
					}
				}
			}
			for(l = 0; l < 2; ++l){
				for(i1 = 0; i1 < 3; ++i1){
					world.setBlock(x + b0 * l, y + i1, z + b1 * l, SapphireBlocks.sapphirePortal, 0, 2);
				}
			}
			return true;
		}
	}
	

}
