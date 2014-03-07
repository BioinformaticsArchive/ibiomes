/*
 * iBIOMES - Integrated Biomolecular Simulations
 * Copyright (C) 2014  Julien Thibault, University of Utah
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.utah.bmi.ibiomes.topo;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Water molecule
 * @author Julien Thibault, University of Utah
 *
 */
public class Water extends Molecule {
		
	/**
	 * Create new molecule
	 * @throws IOException 
	 */
	public Water(){
		this.atoms = new ArrayList<Atom>();
		this.atoms.add(new Atom(0, "H1", "H"));
		this.atoms.add(new Atom(1, "O", "O"));
		this.atoms.add(new Atom(2, "H2", "H"));
		this.name = "Water";
		this.description = "Water molecule (H2O)";
	}

	@Override
	public float getCharge() {
		return this.charge;
	}
}