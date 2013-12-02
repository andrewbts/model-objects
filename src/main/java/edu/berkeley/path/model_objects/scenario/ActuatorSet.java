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

import java.util.ArrayList;
import java.util.List;

/**
 * Model Object Actuator Set class.
 *
 * @author mnjuhn
 */
public class ActuatorSet extends edu.berkeley.path.model_objects.jaxb.ActuatorSet {

  // Describes set type to distinguish between master and controller sub-sets
  /** @y.exclude */  private ScenarioSetType actuatorSetType;

  /**
   * Check to make sure all the Actuators are valid
   *
   * @return boolean
   */
  public boolean isValid() {
    for(Actuator ac : getActuators()) {
      if(!ac.isValid())
        return false;
    }
    return true;
  }

  /**
   * @return the projectId
   */
  @Override
  public long getProjectId() {
    return super.getProjectId();
  }

  /**
   * @param projectId the projectId to set
   */
  @Override
  public void setProjectId(long projectId) {
    super.setProjectId(projectId);
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
   * @return the name
   */
  @Override
  public String getName() {
    return super.getName();
  }

  /**
   * @return the description
   */
  @Override
  public String getDescription() {
    return super.getDescription();
  }

  /**
   * @param desc the description to set
   */
  @Override
  public void setDescription(String desc) {
    super.setDescription(desc);

  }

  /**
   * Gets the value of the lockedForEdit property.
   *
   * @return boolean
   *
   */
  @Override
  public boolean isLockedForEdit() {
    return super.isLockedForEdit();
  }

  /**
   * Sets the value of the lockedForEdit property.
   *
   * @param Boolean value
   *
   */
  @Override
  public void setLockedForEdit(Boolean value) {
    super.setLockedForEdit(value);
  }

  /**
   * Gets the value of the lockedForHistory property.
   *
   * @return boolean
   *
   */
  @Override
  public boolean isLockedForHistory() {
    return super.isLockedForHistory();
  }

  /**
   * Sets the value of the lockedForHistory property.
   *
   * @param Boolean value
   *
   */
  @Override
  public void setLockedForHistory(Boolean value) {
    super.setLockedForHistory(value);
  }

  /**
   * Set the Actutor list. Attaches list of Actuator Model Objects to scenario.
   *
   * @param List<Actuator>	List of extended Actuators to add
   */
  @SuppressWarnings("unchecked")
  public void setActuators(List<Actuator> actuators) {

    List<edu.berkeley.path.model_objects.jaxb.Actuator> actuatorSet = super.getActuator();
    // if no actuator list exists, create a new one.
    if ( actuatorSet == null ) {
      actuatorSet = new ArrayList<edu.berkeley.path.model_objects.jaxb.Actuator>();
    }
    // Clears existing actuator list and adds passed in list of extended model object actuators
    actuatorSet.clear();
    actuatorSet.addAll((List<edu.berkeley.path.model_objects.jaxb.Actuator>)(List<?>)actuators);
    super.actuator = actuatorSet;
  }

  /**
   * Get the list of actuators in the scenario.
   *
   * @return List of all actuators as Actuator Model Objects.
   */
  @SuppressWarnings("unchecked")
  public List<Actuator> getActuators() {
    // return casted list of actuators from JAXB base class
    return (List<Actuator>)(List<?>)super.getActuator();
  }
  
	/**
	 * Get single actuator by numerical ID, if present. 
	 * 
	 * @param id Numerical actuator ID
	 * @return Actuator with the specified ID if present, else null
	 */
	public Actuator getActuatorById(long id) {
		for (Actuator act : getActuators()) {
			if (act.getId() == id)
				return act;
		}
		return null;
	}

  /**
   * Get the object representing this actuator set type
   *
   * @return ScenarioSetType Object which contains scenario set type information
   */
  public ScenarioSetType getActuatorSetType() {
    return actuatorSetType;
  }

  /**
   * Get id representing this actuator set types as defined in the database
   *
   * @return Long
   */
  public Long getActuatorSetTypeId() {
    if (actuatorSetType != null) {
      return actuatorSetType.getId();
    }
    else {
      return null;
    }
  }

  /**
   * Set the number representing the set type as defined in the database
   *
   * @param Id  Set type id as defined in database
   * @param name  Name of set type (ie master or controller)
   * @param description Description of set type
   */
  public void setActuatorSetType(Long Id, String name, String description) {
    ScenarioSetType setType = new ScenarioSetType();
    setType.setId(Id);
    setType.setName(name);
    setType.setDescription(description);
    actuatorSetType = setType;
  }

}
