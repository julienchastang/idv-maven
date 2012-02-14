/*
 * $Id: SaturationTrajectory.java,v 1.14 2005/05/13 18:33:36 jeffmc Exp $
 *
 * Copyright  1997-2004 Unidata Program Center/University Corporation for
 * Atmospheric Research, P.O. Box 3000, Boulder, CO 80307,
 * support@unidata.ucar.edu.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package ucar.unidata.view.sounding;



import java.rmi.RemoteException;

import ucar.visad.display.Displayable;

import visad.*;


/**
 * Provides support for the saturated portion of the pseudo-adiabatic
 * trajectory of a lifted air parcel.
 *
 * @author Steven R. Emmerson
 * @version $Id: SaturationTrajectory.java,v 1.14 2005/05/13 18:33:36 jeffmc Exp $
 */
public class SaturationTrajectory extends Trajectory {

    /**
     * Constructs from nothing.
     * @throws VisADException   VisAD failure.
     * @throws RemoteException  Java RMI failure.
     */
    public SaturationTrajectory() throws RemoteException, VisADException {
        this(DefaultWetTemperatureCalculatorFactory.instance());
    }

    /**
     * Constructs from a factory for creating temperature calculators.
     * @param factory           The factory for creating temperature
     *                          calculators.
     * @throws VisADException   VisAD failure.
     * @throws RemoteException  Java RMI failure.
     */
    public SaturationTrajectory(TemperatureCalculatorFactory factory)
            throws RemoteException, VisADException {
        super("SaturationTrajectory", factory);
    }

    /**
     * Constructs from another instance.
     * @param that                      The other instance.
     * @throws VisADException   VisAD failure.
     * @throws RemoteException  Java RMI failure.
     */
    protected SaturationTrajectory(SaturationTrajectory that)
            throws RemoteException, VisADException {
        super(that);
    }

    /**
     * Returns a clone of this instance suitable for another VisAD display.
     * Underlying data objects are not cloned.
     * @return                  A clone of this instance.
     * @throws VisADException   VisAD failure.
     * @throws RemoteException  Java RMI failure.
     */
    public Displayable cloneForDisplay()
            throws RemoteException, VisADException {
        return new SaturationTrajectory(this);
    }
}







