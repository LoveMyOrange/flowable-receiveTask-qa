/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.model;

/**
 * @author Tijs Rademakers
 */
public class CmmnDiShape extends BaseElement {

    protected String cmmnElementRef;
    protected GraphicInfo graphicInfo;
    protected GraphicInfo labelGraphicInfo;
    
    public String getCmmnElementRef() {
        return cmmnElementRef;
    }
    
    public void setCmmnElementRef(String cmmnElementRef) {
        this.cmmnElementRef = cmmnElementRef;
    }
    
    public GraphicInfo getGraphicInfo() {
        return graphicInfo;
    }
    
    public void setGraphicInfo(GraphicInfo graphicInfo) {
        this.graphicInfo = graphicInfo;
    }

    public GraphicInfo getLabelGraphicInfo() {
        return labelGraphicInfo;
    }

    public void setLabelGraphicInfo(GraphicInfo labelGraphicInfo) {
        this.labelGraphicInfo = labelGraphicInfo;
    }
}
