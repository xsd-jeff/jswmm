/*
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.altervista.growworkinghard.jswmm.dataStructure.options;

import java.util.List;

public class ReportSetup {

    boolean reportInput;
    boolean reportContinuity;
    boolean reportFlowStats;
    boolean reportControls;
    List<String> reportSubcatchments;
    List<String> reportNodes;
    List<String> reportLinks;
    List<LIDcontrol> reportLID;

    public ReportSetup(boolean reportInput, boolean reportContinuity, boolean reportFlowStats, boolean reportControls,
                       List<String> reportSubcatchments, List<String> reportNodes,
                       List<String> reportLinks, List<LIDcontrol> reportLID) {

        this.reportInput = reportInput;
        this.reportContinuity = reportContinuity;
        this.reportFlowStats = reportFlowStats;
        this.reportControls = reportControls;
        this.reportSubcatchments = reportSubcatchments;
        this.reportNodes = reportNodes;
        this.reportLinks = reportLinks;
        this.reportLID = reportLID;
    }
}
