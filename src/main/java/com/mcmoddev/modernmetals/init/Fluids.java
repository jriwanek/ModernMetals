package com.mcmoddev.modernmetals.init;

import com.mcmoddev.modernmetals.data.MaterialNames;
import com.mcmoddev.modernmetals.util.Config.Options;

/**
 * This class initializes all fluids in Modern Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Fluids extends com.mcmoddev.lib.init.Fluids {

	private static boolean initDone = false;

	private Fluids() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.materialEnabled(MaterialNames.ALUMINUM)) {
			addFluid(MaterialNames.ALUMINUM, 2000, 10000, 330, 10);
			addFluidBlock(MaterialNames.ALUMINUM);
		}

		if (Options.materialEnabled(MaterialNames.ALUMINUM_BRASS)) {
			addFluid(MaterialNames.ALUMINUM_BRASS, 2000, 10000, 500, 10);
			addFluidBlock(MaterialNames.ALUMINUM_BRASS);
		}

		if (Options.materialEnabled(MaterialNames.CADMIUM)) {
			addFluid(MaterialNames.CADMIUM, 2000, 10000, 300, 10);
			addFluidBlock(MaterialNames.CADMIUM);
		}

		if (Options.materialEnabled(MaterialNames.CHROMIUM)) {
			addFluid(MaterialNames.CHROMIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.CHROMIUM);
		}

		if (Options.materialEnabled(MaterialNames.GALVANIZED_STEEL)) {
			addFluid(MaterialNames.GALVANIZED_STEEL, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.GALVANIZED_STEEL);
		}

		if (Options.materialEnabled(MaterialNames.IRIDIUM)) {
			addFluid(MaterialNames.IRIDIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.IRIDIUM);
		}

		if (Options.materialEnabled(MaterialNames.MAGNESIUM)) {
			addFluid(MaterialNames.MAGNESIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.MAGNESIUM);
		}

		if (Options.materialEnabled(MaterialNames.MANGANESE)) {
			addFluid(MaterialNames.MANGANESE, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.MANGANESE);
		}

		if (Options.materialEnabled(MaterialNames.NICHROME)) {
			addFluid(MaterialNames.NICHROME, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.NICHROME);
		}

		if (Options.materialEnabled(MaterialNames.OSMIUM)) {
			addFluid(MaterialNames.OSMIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.OSMIUM);
		}

		if (Options.materialEnabled(MaterialNames.PLUTONIUM)) {
			addFluid(MaterialNames.PLUTONIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.PLUTONIUM);
		}

		if (Options.materialEnabled(MaterialNames.RUTILE)) {
			addFluid(MaterialNames.RUTILE, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.RUTILE);
		}

		if (Options.materialEnabled(MaterialNames.STAINLESS_STEEL)) {
			addFluid(MaterialNames.STAINLESS_STEEL, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.STAINLESS_STEEL);
		}

		if (Options.materialEnabled(MaterialNames.TANTALUM)) {
			addFluid(MaterialNames.TANTALUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.TANTALUM);
		}

		if (Options.materialEnabled(MaterialNames.TITANIUM)) {
			addFluid(MaterialNames.TITANIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.TITANIUM);
		}

		if (Options.materialEnabled(MaterialNames.TUNGSTEN)) {
			addFluid(MaterialNames.TUNGSTEN, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.TUNGSTEN);
		}

		if (Options.materialEnabled(MaterialNames.URANIUM)) {
			addFluid(MaterialNames.URANIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.URANIUM);
		}

		if (Options.materialEnabled(MaterialNames.ZIRCONIUM)) {
			addFluid(MaterialNames.ZIRCONIUM, 2000, 10000, 769, 10);
			addFluidBlock(MaterialNames.ZIRCONIUM);
		}

		initDone = true;
	}
}
