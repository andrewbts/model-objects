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

import edu.berkeley.path.model_objects.MOException;
import edu.berkeley.path.model_objects.shared.CrudFlag;

import java.util.ArrayList;

/** 
 * Model Object Demand class.
 *  
 * @author Alexey Goder (alexey@goder.com)
 * @author mnjuhn
 */
public class Demand extends edu.berkeley.path.model_objects.jaxb.Demand {

  // array of demands, ids, ModStamps and CRUDFlags derived from comma separated content string
  /** @y.exclude */ private ArrayList<Double> demandArray;
  /** @y.exclude */ private ArrayList<Long> idArray;
  /** @y.exclude */ private ArrayList<String> modStampArray;
  /** @y.exclude */ private ArrayList<CrudFlag> crudFlagArray;

  /**
   * Gets the length of the number of Demands for a particular link in,
   * link out and vehicle-type.  Essentially the number of dt's
   *
   * @return current number of ratios defined
   */
  public int getDemandSize() throws MOException {
    if (demandArray == null) {
      setDemandArray();
    }

    return demandArray.size();
  }

  /**
   * Gets the value of the demand property.
   *
   * @param offset dt to get demand from
   * @return demand value
   *
   */
  public Double getDemand(int offset) throws MOException {

    Double demand;
    // Demand -- if no demandArray list has been created, create one
    if (demandArray == null) {
      setDemandArray();
    }
    try {
      // get demand value at offset
      demand = demandArray.get(offset);
    } catch(Exception ex) {
      throw new MOException(ex,
          "Error getting demand value at offset " + offset + ".");
    }
    return demand;
  }

  /**
   * Sets the value of the demand property at given offset.
   * Note: Performance will be better to set demands in order
   *
   * @param  offset   The dt offset to add demand value
   * @param  value    The demand value
   *
   */
  public void setDemand(int offset, Double value) throws MOException {

    // Demand -- if no demandArray list has been created, create one
    if (demandArray == null) {
      setDemandArray();
    }

    try {
      // if offset is less than list size, means you are replacing existing value.
      if (offset < demandArray.size()) {
        // add demand to array at offset
        demandArray.set(offset, value);
        // re-create content string based on demand Array list, by removing "[", "]" characters and
        // spaces between commas.
        String demandContent = demandArray.toString().replaceAll("(\\[|\\]|\\s)","");
        super.setContent(demandContent);
      }
      // otherwise try to add demand to end of list
      else {
        // add demand to array at offset
        demandArray.add(offset, value);
        // add demand to end of content string
        String demandContent;
        if (getContent() != null) {
          demandContent = getContent() + "," + value;
        } else {
          demandContent = String.valueOf(value);
        }
        super.setContent(demandContent);
      }
    }
    catch(Exception ex) {
      throw new MOException(ex,
          "Error adding new demand value " + value + " at offset " + offset +
              ". Must add demands in order.");
    }
  }

  /**
   * Gets the value of the id property.
   *
   * @param offset representing dt order
   * @return Id of demand at offset
   */
  public Long getId(int offset) throws MOException {

    Long id;

    // Id -- if no idArray list has been created, create one
    if (idArray == null) {
      setIdArray();
    }
    try {
      // get id value at offset
      id = idArray.get(offset);
    } catch(Exception ex) {
      throw new MOException(ex,
          "Error getting demand id at offset " + offset + ".");
    }
    return id;

  }

  /**
   * Sets the value of the id property at given offset.
   * Note: Performance will be better to set ids in order
   *
   * @param  offset   The dt offset to add id value
   * @param  value    The id value
   *
   */
  public void setId(int offset, Long value) throws MOException {

    // idArray -- if no idArray list has been created, create one
    if (idArray == null) {
      setIdArray();
    }
    try {
      // if offset is less than list size, means you are replacing existing value.
      if (offset < idArray.size()) {
        // add demand id to array at offset
        idArray.set(offset, value);
        // re-create content string based on id Array list, by removing "[", "]" characters and
        // spaces between commas.
        String idContent = idArray.toString().replaceAll("(\\[|\\]|\\s)","");
        super.setIds(idContent);
      }
      // otherwise try to add demand id to end of list
      else {
        // add demand id to array at offset
        idArray.add(offset, value);
        /// add id to end of content string
        String idContent;
        if (getIds() != null) {
          idContent = getIds() + "," + value;
        } else {
          idContent = String.valueOf(value);
        }
        super.setIds(idContent);
      }
    }
    catch(Exception ex) {
      throw new MOException(ex,
          "Error adding new split ratio id " + value + " at offset " + offset +
              ". Must add ratio's in order.");
    }
  }

  /**
   * Gets the value of the modstamp property.
   *
   * @param offset representing dt order
   * @return ModStamp of demand at offset
   *
   */
  public String getModStamp(int offset) throws MOException {

    String modStamp;

    // modStamp -- if no modStampArray list has been created, create one
    if (modStampArray == null) {
      setModStampArray();
    }
    try {
      // get modStamp value at offset
      modStamp = modStampArray.get(offset);
    } catch(Exception ex) {
      throw new MOException(ex,
          "Error getting split demand modStamp at offset " + offset + ".");
    }
    return modStamp;
  }

  /**
   * Sets the value of the modstamp property at given offset.
   * Note: Performance will be better to set modstamps in order
   *
   * @param  offset   The dt offset to add modstamp value
   * @param  value    The modstamp value
   *
   */
  public void setModStamp(int offset, String value) throws MOException {

    // ModStamp -- if no modStampArray list has been created, add one
    if (modStampArray == null) {
      setModStampArray();
    }
    try {
      // if offset is less than to list size, means you are replacing existing value.
      if (offset < modStampArray.size()) {
        // add demand modstamp to array at offset
        modStampArray.set(offset, value);
        // re-create content string based on modstamp Array list, by removing "[", "]" characters and
        // spaces between commas.
        String modStampContent = modStampArray.toString().replaceAll("(\\[|\\]|\\s)","");
        super.setModStamps(modStampContent);
      }
      // otherwise try to add demand modstamp to end of list
      else {
        // add demand modstamp to array at offset
        modStampArray.add(offset, value);
        // add modstamp to end of content string
        String modStampContent;
        if (getModStamps() != null) {
          modStampContent = getModStamps() + "," + value;
        } else {
          modStampContent = String.valueOf(value);
        }
        super.setModStamps(modStampContent);
      }
    }
    catch(Exception ex) {
      throw new MOException(ex,
          "Error adding new demand modStamp " + value + " at offset " + offset +
              ". Must add demands in order.");
    }
  }

  /**
   * Gets the value of the CrudFlag property.
   *
   * @param offset representing dt order
   * @return CrudFlag of demand at offset
   */
  public CrudFlag getCrudFlag(int offset) throws MOException {

    CrudFlag crudFlag;

    // CrudFlag -- if no crudFlagArray list has been created, add one
    if (crudFlagArray == null) {
      setCrudFlagArray();
    }
    try {
      // get crudFlag value at offset
      crudFlag = crudFlagArray.get(offset);
    } catch(Exception ex) {
      throw new MOException(ex,
          "Error getting crudFlag modStamp at offset " + offset + ".");
    }
    return crudFlag;

  }

  /**
   * Sets the value of the modStamp property.
   *
   */
  public void setCrudFlag(int offset, CrudFlag value) throws MOException {

    // CrudFlag -- if no crudFlagArray list has been created, add one
    if (crudFlagArray == null) {
      setCrudFlagArray();
    }
    try {
      // if offset is less than or equal to list size, means you are replacing existing value.
      if (offset < crudFlagArray.size()) {
        // add demand CrudFlag to array at offset
        crudFlagArray.set(offset, value);
        // re-create content string based on crudFlag Array list, by removing "[", "]" characters and
        // spaces between commas.
        String crudFlagContent = crudFlagArray.toString().replaceAll("(\\[|\\]|\\s)","");
        super.setCrudFlags(crudFlagContent);
      }
      // otherwise try to add demand CrudFlag to end of list
      else {
        // add demand CrudFlag to array at offset
        crudFlagArray.add(offset, value);
        // add CrudFlag to end of content string
        String crudFlagContent;
        if (getCrudFlags() != null) {
          crudFlagContent = getCrudFlags() + "," + value;
        } else {
          crudFlagContent = String.valueOf(value);
        }
        super.setCrudFlags(crudFlagContent);
      }
    }
    catch(Exception ex) {
      throw new MOException(ex,
          "Error adding new split demand CRUDFlag " + value.toString() + " at offset " + offset +
              ". Must add demands in order.");
    }
  }


  /**
   * Function to add demand to end of list by offset (dt) or update existing demands
   * If a new demand for a dt is added it must be done in order.
   *
   * @param offset dt offset to add demand
   * @param demand new offset value
   * @param id of demand in database, can be null
   * @param modStamp of split demand in database, can be null
   * @param flag of database action (CRUD) on demand, can be null
   *
   * @throws MOException
   */
  public void setDemand(int offset, Double demand, Long id, String modStamp, CrudFlag flag) throws MOException {

    setDemand(offset, demand);
    if (id != null) {
      setId(offset, id);
    }
    if (modStamp != null) {
      setModStamp(offset, modStamp);
    }
    if (flag != null) {
      setCrudFlag(offset, flag);
    }
  }

  /**
   * Creates the demandArray arraylist object based on demand content string
   * @throws MOException
   *
   */
  private void setDemandArray() throws MOException {

    String demandContent = super.getContent();
    // Create array representation of demands indexed by dt
    try {
      demandArray = new ArrayList<Double>();
      // if demand content value exists populate demandArray arraylist from string
      if (demandContent != null) {
        String[] contentArray = demandContent.split(",");
        // For each value separated by a comma, add it to content array
	      for (String aContentArray : contentArray) {
		      demandArray.add(Double.valueOf(aContentArray.trim()));
	      }
      }
    }
    catch (Exception ex) {
      throw new MOException(ex,
          "Invalid split demand content string. Should be a comma separated string of double values.");
    }
  }

  /**
   * Set idArray arraylist based on id content string
   * @throws MOException
   *
   */
  private void setIdArray() throws MOException {

    String idContent = super.getIds();
    // Create array representation of split demands ids indexed by dt
    try {
      idArray = new ArrayList<Long>();
      // if id content value exists populate demandArray arraylist from string
      if (idContent != null) {
        String[] contentArray = idContent.split(",");
        // For each value separated by a comma, add it to content array
	      for (String aContentArray : contentArray) {
		      idArray.add(Long.valueOf(aContentArray.trim()));
	      }
      }
    }
    catch (Exception ex) {
      throw new MOException(ex,
          "Invalid id content string. Should be a comma separated string of long values.");
    }
  }

  /**
   * Set modStampArray arraylist based on modStamp content string
   * @throws MOException
   *
   */
  private void setModStampArray() throws MOException {

    String modStampContent = super.getModStamps();
    // Create array representation of split demand modstamps indexed by dt
    try {
      modStampArray = new ArrayList<String>();

      if (modStampContent != null) {
        // if modStamp content exists populate modStampArray arraylist from string
        String[] contentArray = modStampContent.split(",");
        // For each value separated by a comma, add it to content array
	      for (String aContentArray : contentArray) {
		      modStampArray.add(aContentArray.trim());
	      }
      }
    }
    catch (Exception ex) {
      throw new MOException(ex,
          "Invalid modStamp content string. Should be a comma separated string of String date values.");
    }
  }

  /**
   * Set crudFlagArray arraylist based on crudFlag content string
   * @throws MOException
   *
   */
  private void setCrudFlagArray() throws MOException {

    String crudFlagContent = super.getCrudFlags();
    // Create array representation of split demand crudFlags indexed by dt
    try {
      crudFlagArray = new ArrayList<CrudFlag>();

      if (crudFlagContent != null) {
        // if CrudFlag content exists populate crudFlagArray arraylist from string
        String[] contentArray = crudFlagContent.split(",");
        // For each value separated by a comma, add it to content array
	      for (String aContentArray : contentArray) {
		      crudFlagArray.add(CrudFlag.valueOf(aContentArray.trim()));
	      }
      }
    }
    catch (Exception ex) {
      throw new MOException(ex,
          "Invalid CrudFlag content string. Should be a comma separated string of String date values.");
    }
  }

	/**
	 * @param id the vehicle type id for this demand
	 */
	@Override
	public void setVehicleTypeId(long id) {
		super.setVehicleTypeId(id);
	}
	
	/**
	 * @return the vehicle type id for this demand
	 */
	@Override
	public long getVehicleTypeId() {
		return super.getVehicleTypeId();
	}

  /**
   * Returns true if the vehTypeId matches this object vehicleTypeId
   *
   * @return boolean
   */
  public boolean equals(long vehTypeId){
    return vehTypeId == this.getVehicleTypeId();
  }

  /**
   * Checks to make sure the object is correct
   * @return boolean
   */
  public boolean isValid(){
    // TODO work on validation logic
    return true;
  }
}
