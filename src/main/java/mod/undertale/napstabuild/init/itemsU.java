package mod.undertale.napstabuild.init;

import mod.undertale.napstabuild.reference;
import mod.undertale.napstabuild.items.ItemGloves;
import mod.undertale.napstabuild.items.ItemGun;
import mod.undertale.napstabuild.items.ItemHotdog;
import mod.undertale.napstabuild.items.ItemPie;
import mod.undertale.napstabuild.items.ItemSpaghetti;
import mod.undertale.napstabuild.items.ItemToyKnife;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class itemsU {

	
	//materials
	public static ToolMaterial ONE = EnumHelper.addToolMaterial("ONE", 1, 2000, 10.0F, 5.0F, 50);
	public static ToolMaterial GLOVES = EnumHelper.addToolMaterial("GLOVES", 1, 2000, 10.0F, 5.0F, 50);
	
	
	//items
	public static Item toy_knife, cinnamon_pie, hotdog, gloves, spaghetti, manly_banana,spider_donuts, spider_cider,
	faded_ribbon, nice_cream, glamburger, legendary_hero, face_steak, instant_noodles, astronaut_food, 
	empty_gun, cowboy_hat, tea_cup, temflakes;
	
	public static final CreativeTabs tabUndertale = new CreativeTabs("Undertale")
	 {
	    @Override public Item getTabIconItem() {
	        return itemsU.spaghetti;
	    }
	};
	
	
	
	public static void init()
    {
		toy_knife = new ItemToyKnife(ONE).setUnlocalizedName("toy_knife").setCreativeTab(itemsU.tabUndertale);
		cinnamon_pie = new ItemPie(20, false).setUnlocalizedName("cinnamon_pie").setCreativeTab(itemsU.tabUndertale);
		spaghetti = new ItemSpaghetti(0, false).setUnlocalizedName("spaghetti").setCreativeTab(itemsU.tabUndertale);
		hotdog = new ItemHotdog(7, true).setUnlocalizedName("hotdog").setCreativeTab(itemsU.tabUndertale);
		gloves = new ItemGloves(GLOVES).setUnlocalizedName("gloves").setCreativeTab(itemsU.tabUndertale);
		empty_gun = new ItemGun().setUnlocalizedName("empty_gun").setCreativeTab(itemsU.tabUndertale);
				
    }
	
	public static void register()
	{
	
		GameRegistry.registerItem(toy_knife, "toy_knife");
		GameRegistry.registerItem(cinnamon_pie, "cinnamon_pie");
		GameRegistry.registerItem(gloves, "gloves");
		GameRegistry.registerItem(hotdog, "hotdog");
		GameRegistry.registerItem(spaghetti, "spaghetti");
		GameRegistry.registerItem(empty_gun, "empty_gun");
	}
	
	public static void registerRenders()
	{
		
		registerRender(toy_knife);
		registerRender(cinnamon_pie);
		registerRender(gloves);
		registerRender(hotdog);
		registerRender(spaghetti);
		registerRender(empty_gun);
		
	}
	 
	private static void registerRender(Item item)
	    {
	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	    }
	}


