/**
 * Copyright (c) 2013, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *   Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 **/

package edu.berkeley.path.model_objects.scenario;

import edu.berkeley.path.model_objects.jaxb.DisplayPosition;
import edu.berkeley.path.model_objects.shared.*;

/**
 * Model Object Actuator class.
 *
 * @author mnjuhn
 */
public class Actuator extends edu.berkeley.path.model_objects.jaxb.Actuator {

  /** @y.exclude */  private Long parametersId;

  /**
   * Check to make sure all actuator is valid
   *
   * @return boolean
   */
  public boolean isValid() {
    // TODO: implement validation logic
    return true;
  }

  /**
   * @param id the id to set
   */
  @Override
  public void setId(long id) {
    super.setId(id);
  }

  /**
   * @return the id
   */
  @Override
  public long getId() {
    return super.getId();
  }

  /**
   * @param name the name to set
   */
  @Override
  public void setName(String name) {
    super.setName(name);
  }

  /**
   * @return the name
   */
  @Override
  public String getName() {
    return super.getName();
  }

  /**
   * Sets network id actuator is associated with
   *
   * @param id the network id to set
   */
  @Override
  public void setNetworkId(Long id) {
    super.setNetworkId(id);
  }

  /**
   * Gets the network id associated with actuator
   *
   * @return network id associated with actuator
   */
  @Override
  public Long getNetworkId() {
    return super.getNetworkId();
  }


  /**
   * @param modstamp the modstamp to set
   */
  @Override
  public void setModStamp(String modstamp) {
    super.setModStamp(modstamp);
  }


  /**
   * @return the modStamp
   */
  @Override
  public String getModStamp() {
    return super.getModStamp();
  }

  /**
   * Get CRUD (Create, Retrieve, Update, Delete) Action Flag for object
   *
   * @return CRUD Flag enumeration
   */
  public CrudFlag getCrudFlagEnum() {

    CrudFlag flag = null;
    // Check if CRUDFlag is null, if so return NONE enumeration
    if (super.getCrudFlag() == null) {
      setCrudFlagEnum(CrudFlag.NONE);
      flag = CrudFlag.NONE;
    }
    else {
      switch (CrudFlag.valueOf(super.getCrudFlag())) {
        case CREATE:
          flag = CrudFlag.CREATE;
          break;
        case RETRIEVE:
          flag = CrudFlag.RETRIEVE;
          break;
        case UPDATE:
          flag = CrudFlag.UPDATE;
          break;
        case DELETE:
          flag = CrudFlag.DELETE;
          break;
        default:
          flag = CrudFlag.NONE;
          break;

      }
    }
    return flag;
  }

  /**
   * Set CRUD (Create, Retrieve, Update, Delete) Action Flag for object
   *
   * @param CRUD Flag enumeration
   */
  public void setCrudFlagEnum(edu.berkeley.path.model_objects.shared.CrudFlag flag) {
    // Check if CRUDFlag is null, if so return NONE enumeration
    if (flag == null) {
      super.setCrudFlag("NONE");
    }
    else {
      switch (flag) {
        case CREATE:
          super.setCrudFlag("CREATE");
          break;
        case RETRIEVE:
          super.setCrudFlag("RETRIEVE");
          break;
        case UPDATE:
          super.setCrudFlag("UPDATE");
          break;
        case DELETE:
          super.setCrudFlag("DELETE");
          break;
        default:
          super.setCrudFlag("NONE");
          break;

      }
    }
  }

  /**
   * Get Actuator Type for this object
   *
   * @return ActuatorType  An object representing the the id, name, and
   * description for this ScenarioElementType
   */
  @Override
  public edu.berkeley.path.model_objects.jaxb.ActuatorType getActuatorType() {
    return super.getActuatorType();
  }

  /**
   * Convenience method for users to get Actuator Type Id directly
   *
   * @return Long The id of the Actuator Type
   */
  public Long getActuatorTypeId() {
    if (getActuatorType() != null) {
      return getActuatorType().getId();
    }
    else {
      return null;
    }
  }

  /**
   * Set the Actuator Type for this object based on the parameters passed in.
   *
   * @param typeId Id of the ActuatorType
   * @param name Name of the ActuatorType
   * @param desc Description of the ActuatorType
   */
  public void setActuatorType(long typeId, String name, String desc) {
    edu.berkeley.path.model_objects.jaxb.ActuatorType type =
        new edu.berkeley.path.model_objects.jaxb.ActuatorType();
    type.setId(typeId);
    type.setName(name);
    type.setDescription(desc);
    setActuatorType(type);
  }

  /**
   * Get Scenario Element
   *
   * @return Scenario Element attached to actuator
   */
  public ScenarioElement getScenarioElement() {
    return (ScenarioElement) super.getScenarioElement();
  }

  /**
   * Set Scenario Element
   *
   * @param element Scenario Element attached to actuator
   */
  public void setScenarioElement(ScenarioElement element) {
    super.setScenarioElement(element);
  }

  /**
   * Get the original actuator id
   *
   * @return String the actuatorIdOriginal
   */
  @Override
  public String getActuatorIdOriginal() {
    return super.getActuatorIdOriginal();
  }


  /**
   * Set the original actuator id
   *
   * @param actuatorIdOriginal the actuatorIdOriginal to set
   */
  @Override
  public void setActuatorIdOriginal(String actuatorIdOriginal) {
    super.setActuatorIdOriginal(actuatorIdOriginal);
  }


  /**
   * Return the Display position as a Point object.
   *
   * @return Point the displayPosition as Point Object; null if not set
   */
  public edu.berkeley.path.model_objects.shared.Point getActuatorDisplayPosition() {
    edu.berkeley.path.model_objects.shared.Point result = null;

    if(super.getDisplayPosition() != null
        && super.getDisplayPosition().getPoint() != null
        && super.getDisplayPosition().getPoint().size() > 0) {

      result = (edu.berkeley.path.model_objects.shared.Point) super.getDisplayPosition().getPoint().get(0);
    }

    return result;
  }

  /**
   * @param point the point of the actuator (put into a JAXB displayPosition) to set
   */
  public void setDisplayPosition(edu.berkeley.path.model_objects.shared.Point point) {
    DisplayPosition dp = new DisplayPosition();
    dp.getPoint().add(point);
    super.setDisplayPosition(dp);
  }

  /**
   * @return Parameters the parameters associated with this actuator
   */
  @Override
  public edu.berkeley.path.model_objects.shared.Parameters getParameters() {
    return (edu.berkeley.path.model_objects.shared.Parameters)super.getParameters();
  }


  /**
   * @param Parameters the parameters to set the actuator
   */
  public void setParameters(edu.berkeley.path.model_objects.shared.Parameters parameters) {
    super.setParameters(parameters);
  }

  /**
   * Get Usage Type for this Actuator Reference
   *
   * @return UsageType  An object representing the the id, name, and
   * description for this UsageType
   */
  @Override
  public edu.berkeley.path.model_objects.jaxb.UsageType getUsageType() {
    return super.getUsageType();
  }

  /**
   * Convenience method for users to get Usage Type Id directly
   *
   * @return Integer The id of the Usage Type
   */
  public Integer getUsageTypeId() {
    if (getUsageType() != null) {
      return getUsageType().getId();
    }
    else {
      return null;
    }
  }

  /**
   * Set the Usage Type for this Actuator based on the parameters passed in.
   *
   * @param typeId Id of the UsageType
   * @param name Name of the UsageType
   * @param desc Description of the UsageType
   */
  public void setUsageType(Integer typeId, String name, String desc) {
    edu.berkeley.path.model_objects.jaxb.UsageType type =
        new edu.berkeley.path.model_objects.jaxb.UsageType();
    type.setId(typeId);
    type.setName(name);
    type.setDescription(desc);
    super.setUsageType(type);
  }

  /**
   * Get the parameters config id associated with this actuator
   *
   * @return parameters config id
   */
  public Long getParametersId() {
    return parametersId;
  }

  /**
   * Set the parameters config id associated with this actuator
   *
   * @param parametersId of its actuator parameters
   */
  public void setParametersId(Long parametersId) {
    this.parametersId = parametersId;
  }

}
