/*
 * Copyright 1997-2010 Unidata Program Center/University Corporation for
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
 * 
 */

package ucar.unidata.collab;





/**
 * @author Jeff McWhirter
 * @version $Revision: 1.6 $Date: 2005/09/21 17:13:21 $
 */

public interface Sharable {

    /**
     * _more_
     * @return _more_
     */
    public boolean getSharing();

    /**
     * Record the time when this object rcvd the share
     *
     * @param dataId data id
     * @param time time
     */
    public void setReceiveShareTime(Object dataId, Long time);

    /**
     * Get the last time this object rcvd the share
     *
     * @param dataId data id
     *
     * @return last time or null
     */
    public Long getReceiveShareTime(Object dataId);


    /**
     * _more_
     *
     * @param from
     * @param dataId
     * @param data
     */
    public void receiveShareData(Sharable from, Object dataId, Object[] data);

    /**
     * _more_
     * @return _more_
     */
    public Object getShareGroup();

    /**
     * _more_
     * @return _more_
     */
    public String getUniqueId();
}
