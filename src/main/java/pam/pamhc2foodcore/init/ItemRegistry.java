package pam.pamhc2foodcore.init;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pam.pamhc2foodcore.Pamhc2foodcore;
import pam.pamhc2foodcore.item.ItemPamTool;

public class ItemRegistry {

	//tools
	public static Item bakewareitem;
	public static Item cuttingboarditem;
	public static Item juiceritem;
	public static Item grinderitem;
	public static Item mixingbowlitem;
	public static Item potitem;
	public static Item rolleritem;
	public static Item saucepanitem;
	public static Item skilletitem;

	//wheat
	public static Item flouritem;
	public static Item doughitem;
	public static Item toastitem;
	public static Item grilledcheeseitem;
	public static Item carrotbreaditem;
	public static Item pumpkinbreaditem;
	public static Item pastaitem;
	public static Item macncheeseitem;
	public static Item noodlesoupitem;
	public static Item applepieitem;
	public static Item sweetberrypieitem;
	public static Item chocolatecupcakeitem;
	public static Item carrotcupcakeitem;
	public static Item pumpkincupcakeitem;
	public static Item caramelcupcakeitem;

	public static Item batteritem;
	public static Item chocolatecakeitem;
	public static Item cheesecakeitem;
	public static Item pumpkincheesecakeitem;
	public static Item carrotcakeitem;
	public static Item chocolatemuffinitem;
	public static Item carrotmuffinitem;
	public static Item pumpkinmuffinitem;
	public static Item caramelmuffinitem;
	public static Item donutitem;
	public static Item chocolatedonutitem;
	public static Item jellydonutitem;
	
	public static Item crackeritem;
	public static Item softpretzelitem;

	//milk
	public static Item butteritem;
	public static Item cheeseitem;
	public static Item creamitem;
	public static Item yogurtitem;
	public static Item chocolateyogurtitem;
	public static Item appleyogurtitem;
	public static Item sweetberryyogurtitem;
	public static Item pumpkinyogurtitem;
	public static Item caramelyogurtitem;
	public static Item icecreamitem;
	public static Item chocolateicecreamitem;
	public static Item caramelicecreamitem;
	public static Item cookiesandmilkitem;

	//cocoa
	public static Item chocolatebaritem;
	public static Item cocoapowderitem;
	public static Item hotchocolateitem;
	public static Item chocolatebaconitem;
	public static Item chocolatepuddingitem;
	public static Item chocolaterollitem;
	public static Item chocolatecaramelfudgeitem;
	public static Item smoresitem;
	public static Item trailmixitem;

	//egg
	public static Item mayonaiseitem;
	public static Item boiledeggitem;
	public static Item friedeggitem;
	public static Item scrambledeggitem;

	//apple
	public static Item applejuiceitem;
	public static Item applesmoothieitem;
	public static Item applejellyitem;
	public static Item applejellytoastitem;
	public static Item applesauceitem;

	//melon
	public static Item melonjuiceitem;
	public static Item melonsmoothieitem;
	public static Item melonjellyitem;
	public static Item melonjellytoastitem;

	//sweet berry
	public static Item sweetberryjuiceitem;
	public static Item sweetberrysmoothieitem;
	public static Item sweetberryjellyitem;
	public static Item sweetberryjellytoastitem;

	//chicken
	public static Item friedchickenitem;
	public static Item groundchickenitem;
	public static Item chickennuggetitem;
	public static Item basicchickensandwichitem;
	public static Item chickenjerkyitem;
	public static Item chickenpotpieitem;
	public static Item chickendinneritem;

	//beef
	public static Item potroastitem;
	public static Item groundbeefitem;
	public static Item basichamburgeritem;
	public static Item basiccheeseburgeritem;
	public static Item baconcheeseburgeritem;
	public static Item beefjerkyitem;

	//pork
	public static Item groundporkitem;
	public static Item porkjerkyitem;
	public static Item hotdogitem;
	public static Item baconandeggsitem;
	public static Item epicbaconitem;

	//fish
	public static Item groundfishitem;
	public static Item fishsticksitem;
	public static Item basicfishsandwichitem;
	public static Item fishjerkyitem;
	public static Item fishandchipsitem;

	//mutton
	public static Item groundmuttonitem;
	public static Item muttonjerkyitem;

	//rabbit
	public static Item groundrabbititem;
	public static Item rabbitjerkyitem;

	//potato
	public static Item butteredbakedpotatoitem;
	public static Item mashedpotatoesitem;
	public static Item friesitem;
	public static Item potatochipsitem;
	public static Item potatosoupitem;

	//carrot
	public static Item glazedcarrotsitem;
	public static Item carrotsoupitem;

	//beet
	public static Item pickledbeetsitem;

	//pumpkin
	public static Item pumpkinsoupitem;

	//sugar
	public static Item caramelitem;
	public static Item caramelappleitem;
	public static Item marshmellowsitem;
	public static Item marshmellowchicksitem;
	public static Item cottoncandyitem;
	public static Item gummybearsitem;
	public static Item jellybeansitem;

	//misc
	public static Item cookingoilitem;
	public static Item vinegaritem;
	public static Item freshwateritem;
	public static Item freshmilkitem;
	public static Item saltitem;
	public static Item stockitem;
	public static Item sunflowerseedsitem;
	public static Item roastedsunflowerseedsitem;

	//generic food
	public static Item fruitpunchitem;
	public static Item stewitem;
	public static Item bakedvegetablemedlyitem;
	public static Item fruitsaladitem;
	public static Item meatloafitem;
	public static Item p8juiceitem;
	public static Item fruitcrumbleitem;
	
	
	
	

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;
		
		//tools
		bakewareitem = register("bakewareitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		cuttingboarditem = register("cuttingboarditem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		juiceritem = register("juiceritem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		grinderitem = register("grinderitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		mixingbowlitem = register("mixingbowlitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		potitem = register("potitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		rolleritem = register("rolleritem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		saucepanitem = register("saucepanitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		skilletitem = register("skilletitem", new ItemPamTool((new Item.Properties()).maxStackSize(1).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE

		//wheat
		flouritem = register("flouritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		doughitem = register("doughitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		toastitem = register("toastitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.TOASTITEM)));
		grilledcheeseitem = register("grilledcheeseitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GRILLEDCHEESEITEM)));
		carrotbreaditem = register("carrotbreaditem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARROTBREADITEM)));
		pumpkinbreaditem = register("pumpkinbreaditem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINBREADITEM)));
		pastaitem = register("pastaitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		macncheeseitem = register("macncheeseitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MACNCHEESEITEM)));
		noodlesoupitem = register("noodlesoupitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.NOODLESOUPITEM)));
		applepieitem = register("applepieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLEPIEITEM)));
		sweetberrypieitem = register("sweetberrypieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYPIEITEM)));
		chocolatecupcakeitem = register("chocolatecupcakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATECUPCAKEITEM)));
		carrotcupcakeitem = register("carrotcupcakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARROTCUPCAKEITEM)));
		pumpkincupcakeitem = register("pumpkincupcakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINCUPCAKEITEM)));
		caramelcupcakeitem = register("caramelcupcakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELCUPCAKEITEM)));

		batteritem = register("batteritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		chocolatecakeitem = register("chocolatecakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATECAKEITEM)));
		cheesecakeitem = register("cheesecakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHEESECAKEITEM)));
		pumpkincheesecakeitem = register("pumpkincheesecakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINCHEESECAKEITEM)));
		carrotcakeitem = register("carrotcakeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARROTCAKEITEM)));
		chocolatemuffinitem = register("chocolatemuffinitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEMUFFINITEM)));
		carrotmuffinitem = register("carrotmuffinitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARROTMUFFINITEM)));
		pumpkinmuffinitem = register("pumpkinmuffinitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINMUFFINITEM)));
		caramelmuffinitem = register("caramelmuffinitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELMUFFINITEM)));
		donutitem = register("donutitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.DONUTITEM)));
		chocolatedonutitem = register("chocolatedonutitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEDONUTITEM)));
		jellydonutitem = register("jellydonutitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.JELLYDONUTITEM)));
		
		crackeritem = register("crackeritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CRACKERITEM)));
		softpretzelitem = register("softpretzelitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SOFTPRETZELITEM)));

		//milk
		butteritem = register("butteritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		cheeseitem = register("cheeseitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHEESEITEM)));
		creamitem = register("creamitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		yogurtitem = register("yogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.YOGURTITEM)));
		chocolateyogurtitem = register("chocolateyogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEYOGURTITEM)));
		appleyogurtitem = register("appleyogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLEYOGURTITEM)));
		sweetberryyogurtitem = register("sweetberryyogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYYOGURTITEM)));
		pumpkinyogurtitem = register("pumpkinyogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINYOGURTITEM)));
		caramelyogurtitem = register("caramelyogurtitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELYOGURTITEM)));
		icecreamitem = register("icecreamitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.ICECREAMITEM)));
		chocolateicecreamitem = register("chocolateicecreamitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEICECREAMITEM)));
		caramelicecreamitem = register("caramelicecreamitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELICECREAMITEM)));
		cookiesandmilkitem = register("cookiesandmilkitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.COOKIESANDMILKITEM)));

		//cocoa
		chocolatebaritem = register("chocolatebaritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEBARITEM)));
		cocoapowderitem = register("cocoapowderitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		hotchocolateitem = register("hotchocolateitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.HOTCHOCOLATEITEM)));
		chocolatebaconitem = register("chocolatebaconitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEBACONITEM)));
		chocolatepuddingitem = register("chocolatepuddingitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEPUDDINGITEM)));
		chocolaterollitem = register("chocolaterollitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATEROLLITEM)));
		chocolatecaramelfudgeitem = register("chocolatecaramelfudgeitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHOCOLATECARAMELFUDGEITEM)));
		smoresitem = register("smoresitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SMORESITEM)));
		trailmixitem = register("trailmixitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.TRAILMIXITEM)));

		//egg
		mayonaiseitem = register("mayonaiseitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		boiledeggitem = register("boiledeggitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BOILEDEGGITEM)));
		friedeggitem = register("friedeggitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRIEDEGGITEM)));
		scrambledeggitem = register("scrambledeggitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SCRAMBLEDEGGITEM)));

		//apple
		applejuiceitem = register("applejuiceitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLEJUICEITEM)));
		applesmoothieitem = register("applesmoothieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLESMOOTHIEITEM)));
		applejellyitem = register("applejellyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLEJELLYITEM)));
		applejellytoastitem = register("applejellytoastitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLEJELLYTOASTITEM)));
		applesauceitem = register("applesauceitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.APPLESAUCEITEM)));

		//melon
		melonjuiceitem = register("melonjuiceitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MELONJUICEITEM)));
		melonsmoothieitem = register("melonsmoothieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MELONSMOOTHIEITEM)));
		melonjellyitem = register("melonjellyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MELONJELLYITEM)));
		melonjellytoastitem = register("melonjellytoastitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MELONJELLYTOASTITEM)));

		//sweet berry
		sweetberryjuiceitem = register("sweetberryjuiceitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYJUICEITEM)));
		sweetberrysmoothieitem = register("sweetberrysmoothieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYSMOOTHIEITEM)));
		sweetberryjellyitem = register("sweetberryjellyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYJELLYITEM)));
		sweetberryjellytoastitem = register("sweetberryjellytoastitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SWEETBERRYJELLYTOASTITEM)));

		//chicken
		friedchickenitem = register("friedchickenitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRIEDCHICKENITEM)));
		groundchickenitem = register("groundchickenitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDCHICKENITEM)));
		chickennuggetitem = register("chickennuggetitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHICKENNUGGETITEM)));
		basicchickensandwichitem = register("basicchickensandwichitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BASICCHICKENSANDWICHITEM)));
		chickenjerkyitem = register("chickenjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHICKENJERKYITEM)));
		chickenpotpieitem = register("chickenpotpieitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHICKENPOTPIEITEM)));
		chickendinneritem = register("chickendinneritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CHICKENDINNERITEM)));

		//beef
		potroastitem = register("potroastitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.POTROASTITEM)));
		groundbeefitem = register("groundbeefitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDBEEFITEM)));
		basichamburgeritem = register("basichamburgeritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BASICHAMBURGERITEM)));
		basiccheeseburgeritem = register("basiccheeseburgeritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BASICCHEESEBURGERITEM)));
		baconcheeseburgeritem = register("baconcheeseburgeritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BACONCHEESEBURGERITEM)));
		beefjerkyitem = register("beefjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BEEFJERKYITEM)));

		//pork
		groundporkitem = register("groundporkitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDPORKITEM)));
		porkjerkyitem = register("porkjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PORKJERKYITEM)));
		hotdogitem = register("hotdogitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.HOTDOGITEM)));
		baconandeggsitem = register("baconandeggsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BACONANDEGGSITEM)));
		epicbaconitem = register("epicbaconitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.EPICBACONITEM)));

		//fish
		groundfishitem = register("groundfishitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDFISHITEM)));
		fishsticksitem = register("fishsticksitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FISHSTICKSITEM)));
		basicfishsandwichitem = register("basicfishsandwichitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BASICFISHSANDWICHITEM)));
		fishjerkyitem = register("fishjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FISHJERKYITEM)));
		fishandchipsitem = register("fishandchipsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FISHANDCHIPSITEM)));

		//mutton
		groundmuttonitem = register("groundmuttonitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDMUTTONITEM)));
		muttonjerkyitem = register("muttonjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MUTTONJERKYITEM)));

		//rabbit
		groundrabbititem = register("groundrabbititem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GROUNDRABBITITEM)));
		rabbitjerkyitem = register("rabbitjerkyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.RABBITJERKYITEM)));

		//potato
		butteredbakedpotatoitem = register("butteredbakedpotatoitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BUTTEREDBAKEDPOTATOITEM)));
		mashedpotatoesitem = register("mashedpotatoesitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MASHEDPOTATOESITEM)));
		friesitem = register("friesitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRIESITEM)));
		potatochipsitem = register("potatochipsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.POTATOCHIPSITEM)));
		potatosoupitem = register("potatosoupitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.POTATOSOUPITEM)));

		//carrot
		glazedcarrotsitem = register("glazedcarrotsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GLAZEDCARROTSITEM)));
		carrotsoupitem = register("carrotsoupitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARROTSOUPITEM)));

		//beet
		pickledbeetsitem = register("pickledbeetsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PICKLEDBEETSITEM)));

		//pumpkin
		pumpkinsoupitem = register("pumpkinsoupitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.PUMPKINSOUPITEM)));

		//sugar
		caramelitem = register("caramelitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELITEM)));
		caramelappleitem = register("caramelappleitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.CARAMELAPPLEITEM)));
		marshmellowsitem = register("marshmellowsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MARSHMELLOWSITEM)));
		marshmellowchicksitem = register("marshmellowchicksitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MARSHMELLOWCHICKSITEM)));
		cottoncandyitem = register("cottoncandyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.COTTONCANDYITEM)));
		gummybearsitem = register("gummybearsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.GUMMYBEARSITEM)));
		jellybeansitem = register("jellybeansitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.JELLYBEANSITEM)));

		//misc
		cookingoilitem = register("cookingoilitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		vinegaritem = register("vinegaritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		freshwateritem = register("freshwateritem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		freshmilkitem = register("freshmilkitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		saltitem = register("saltitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP)));//INEDIBLE
		stockitem = register("stockitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.STOCKITEM)));
		sunflowerseedsitem = register("sunflowerseedsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.SUNFLOWERSEEDSITEM)));
		roastedsunflowerseedsitem = register("roastedsunflowerseedsitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDSUNFLOWERSEEDSITEM)));

		//generic food
		fruitpunchitem = register("fruitpunchitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRUITPUNCHITEM)));
		stewitem = register("stewitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.STEWITEM)));
		bakedvegetablemedlyitem = register("bakedvegetablemedlyitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.BAKEDVEGETABLEMEDLYITEM)));
		fruitsaladitem = register("fruitsaladitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRUITSALADITEM)));
		meatloafitem = register("meatloafitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.MEATLOAFITEM)));
		p8juiceitem = register("p8juiceitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.P8JUICEITEM)));
		fruitcrumbleitem = register("fruitcrumbleitem", new Item((new Item.Properties()).group(Pamhc2foodcore.ITEM_GROUP).food(FoodBuilderRegistry.FRUITCRUMBLEITEM)));
		
	}

	
	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2foodcore.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}

	

	
}
