/*
 * Copyright (c) 2013, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
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
 */

package edu.berkeley.path.model_objects;

import edu.berkeley.path.model_objects.jaxb.ObjectFactory;
import edu.berkeley.path.model_objects.measurements.*;
import edu.berkeley.path.model_objects.network.*;
import edu.berkeley.path.model_objects.scenario.*;
import edu.berkeley.path.model_objects.shared.*;
import edu.berkeley.path.model_objects.dynamic.*;

/**
 * This factory is intended to load a whole scenario from JSON/XML
 * Grouping all existing factories we can get a full model-objects representation instead of some jaxb-based elements
 */
public class ModelObjectsFactory extends ObjectFactory {

  /**
   * Create an instance of Actuator Model Object
   *
   * @return Actuator Model Object
   */
  @Override
  public Actuator createActuator() {
    return new Actuator();
  }

  /**
   * Create an instance of ActuatorSet Model Object
   *
   * @return ActuatorSet Model Object
   */
  @Override
  public ActuatorSet createActuatorSet() {
    return new ActuatorSet();
  }

  /**
   * Create an instance of TargetActuator Model Object
   *
   * @return Target Actuator Model Object
   *
   */
  public TargetActuator createTargetActuator() {
    return new TargetActuator();
  }

  /**
   * Create an instance of ScenarioElement Model Object
   *
   * @return Scenario Element Model Object
   *
   */
  @Override
  public ScenarioElement createScenarioElement() {
    return new ScenarioElement();
  }

  /**
   * Create an instance of Sensor Model Object
   *
   * @return Sensor Model Object
   */
  @Override
  public Sensor createSensor() {
    return new Sensor();
  }

  /**
   * Create an instance of SensorSet Model Object
   *
   * @return SensorSet Model Object
   */
  @Override
  public SensorSet createSensorSet() {
    return new SensorSet();
  }

  /**
   * Create an instance of FeedbackSensor Model Object
   *
   * @return Feedback Sensor Model Object
   */
  @Override
  public FeedbackSensor createFeedbackSensor() {
    return new FeedbackSensor();
  }

  /**
   * Create an instance of Controller Model Object
   *
   * @return Controller Model Object
   */
  @Override
  public Controller createController() {
    return new Controller();
  }

  /**
   * Create an instance of ControllerSet Model Object
   *
   * @return ControllerSet Model Object
   */
  @Override
  public ControllerSet createControllerSet() {
    return new ControllerSet();
  }

  /**
   * Create an instance of Density Model Object
   *
   * @return Density Model Object
   */
  @Override
  public Density createDensity() {
    return new Density();
  }

  /**
   * Create an instance of Dynamic InitialDensitySet Model Object
   *
   * @return DynamicInitialDensitySet Model Object
   */
  @Override
  public DynamicInitialDensitySet createDynamicInitialDensitySet() {
    return new DynamicInitialDensitySet();
  }


  /**
   * Create an instance of Dynamic Density Model Object
   *
   * @return Dynamic Density Model Object
   */
  @Override
  public DynamicDensity createDynamicDensity() {
    return new DynamicDensity();
  }

  /**
   * Create an instance of InitialDensitySet Model Object
   *
   * @return InitialDensitySet Model Object
   */
  @Override
  public InitialDensitySet createInitialDensitySet() {
    return new InitialDensitySet();
  }

  /**
   * Create an instance of DemandSet Model Object
   *
   * @return DemandSet Model Object
   */
  @Override
  public DemandSet createDemandSet() {
    return new DemandSet();
  }

  /**
   * Create an instance of DemandProfile Model Object
   *
   * @return DemandProfile Model Object
   */
  @Override
  public DemandProfile createDemandProfile() {
    return new DemandProfile();
  }

  /**
   * Create an instance of DynamicDemandSet Model Object
   *
   * @return DynamicDemandSet Model Object
   */
  @Override
  public DynamicDemandSet createDynamicDemandSet() {
    return new DynamicDemandSet();
  }

  /**
   * Create an instance of DynamicDemandProfile Model Object
   *
   * @return DynamicDemandProfile Model Object
   */
  @Override
  public DynamicDemandProfile createDynamicDemandProfile() {
    return new DynamicDemandProfile();
  }

	/**
	 * Create an instance of DynamicDemand Model Object
	 *
	 * @return DynamicDemand Model Object
	 */
	@Override
	public DynamicDemand createDynamicDemand() {
		return new DynamicDemand();
	}

  /**
   * Create an instance of FundamentalDiagramSet Model Object
   *
   * @return FundamentalDiagramSet Model Object
   */
  @Override
  public FundamentalDiagramSet createFundamentalDiagramSet() {
    return new FundamentalDiagramSet();
  }

  /**
   * Create an instance of FundamentalDiagramProfile Model Object
   *
   * @return FundamentalDiagramProfile Model Object
   */
  @Override
  public FundamentalDiagramProfile createFundamentalDiagramProfile() {
    return new FundamentalDiagramProfile();
  }

  @Override
  public FundamentalDiagram createFundamentalDiagram() {
    return new FundamentalDiagram();
  }

  /**
   * Create an instance of FundamentalDiagramType Model Object
   *
   * @return FundamentalDiagramType Model Object
   */
  @Override
  public FundamentalDiagramType createFundamentalDiagramType() {
    return new FundamentalDiagramType();
  }

  /**
   * Create an instance of Splitratio Model Object
   *
   * @return Splitratio Model Object
   */
  @Override
  public Splitratio createSplitratio() {
    return new Splitratio();
  }

  /**
   * Create an instance of SplitRatioProfile Model Object
   *
   * @return SplitRatioProfile Model Object
   */
  @Override
  public SplitRatioProfile createSplitRatioProfile() {
    return new SplitRatioProfile();
  }

  /**
   * Create an instance of SplitRatioProfile Model Object
   *
   * @return SplitRatioProfile Model Object
   */
  @Override
  public Demand createDemand() {
    return new Demand();
  }

  /**
   * Create an instance of Scenario Model Object
   *
   * @return Scenario Model Object
   */
  @Override
  public Scenario createScenario() {
    return new Scenario();
  }

  /**
   * Create an instance of SplitRatioSet  Model Object
   *
   * @return SplitRatioSet  Model Object
   */
  @Override
  public SplitRatioSet createSplitRatioSet() {

    return new SplitRatioSet();
  }

  /**
   * Create an instance of DynamicSplitRatioSet Model Object
   *
   * @return DynamicSplitRatioSet Model Object
   */
  @Override
  public DynamicSplitRatioSet createDynamicSplitRatioSet() {
    return new DynamicSplitRatioSet();
  }

  /**
   * Create an instance of DynamicSplitRatioProfile Model Object
   *
   * @return DynamicSplitRatioProfile Model Object
   */
  @Override
  public DynamicSplitRatioProfile createDynamicSplitRatioProfile() {
    return new DynamicSplitRatioProfile();
  }

  /**
   * Create an instance of DynamicSplitRatio Model Object
   *
   * @return DynamicSplitRatio Model Object
   */
  @Override
  public DynamicSplitRatio createDynamicSplitRatio() {
    return new DynamicSplitRatio();
  }

  /**
   * Create an instance of PIFProbeData  Model Object
   *
   * @return PIFProbeData  Model Object
   */
  @Override
  public PIFProbeData createPIFProbeData() {
    return new PIFProbeData();
  }

  /**
   * Create an instance of PIFProbeDataSet  Model Object
   *
   * @return PIFProbeDataSet  Model Object
   */
  @Override
  public PIFProbeDataSet createPIFProbeDataSet() {
    return new PIFProbeDataSet();
  }

  /**
   * Create an instance of Route Model Object
   *
   * @return Route Model Object
   */
  @Override
  public Route createRoute() {
    return new Route();
  }

  /**
   * Create an instance of RouteLink Model Object
   *
   * @return Route Model Object
   */
  @Override
  public RouteLink createRouteLink() {
    return new RouteLink();
  }

  /**
   * Create an instance of createCalibrationAlgorithmType Model Object
   *
   * @return createCalibrationAlgorithmType Model Object
   */
  @Override
  public CalibrationAlgorithmType createCalibrationAlgorithmType() {
    return new CalibrationAlgorithmType();
  }

  /**
   * Create an instance of Network Model Object
   *
   * @return  Network Model Object
   */
  @Override
  public Network createNetwork() {
    return new Network();
  }

  /**
   * Create an instance of Link Model Object
   *
   * @return  Link Model Object
   */
  @Override
  public Link createLink() {
    return new Link();
  }

  /**
   * Create an instance of Node Model Object
   *
   * @return  Node Model Object
   */
  @Override
  public Node createNode() {
    return new Node();
  }

  /**
   * Create an instance of Position object
   * @return Position object
   */
  public Position createPosition(){
    return new Position();
  }

  /**
   * Create an instance of Point object
   * @return Position object
   */
  public Point createPoint(){
    return new Point();
  }

  /**
   * Create an instance of Parameters object
   * @return Parameters object
   */
  public Parameters createParameters(){
    return new Parameters();
  }

  /**
   * Create an instance of Parameter object
   * @return Parameter object
   */
  public Parameter createParameter(){
    return new Parameter();
  }

  /**
   * Create an instance of Project object
   * @return Project object
   */
  public Project createProject(){
    return new Project();
  }
  /**
   * Create an instance of PeMSDatum object
   * @return PeMSDatum object
   */
  @Override
  public PeMSDatum createPeMSDatum(){
    return new PeMSDatum();
  }

  /**
   * Create an instance of PeMSStationAggregate object
   * @return PeMSStationAggregate object
   */
  @Override
  public PeMSStationAggregate createPeMSStationAggregate(){
    return new PeMSStationAggregate();
  }

  /**
   * Create an instance of PeMSDataSet object
   * @return PeMSDataSet object
   */
  @Override
  public PeMSDataSet createPeMSDataSet(){
    return new PeMSDataSet();
  }

  /**
   * Create an instance of PeMSDataProfile object
   * @return PeMSDataProfile object
   */
  @Override
  public PeMSDataProfile createPeMSDataProfile(){
    return new PeMSDataProfile();
  }

  /**
   * Create an instance of PeMSAggregate object
   * @return PeMSAggregate object
   */
  @Override
  public PeMSAggregate createPeMSAggregate(){
    return new PeMSAggregate();
  }

  /**
   * Create an instance of VDS object
   * @return PeMSDatum object
   */
  @Override
  public VDS createVDS(){
    return new VDS();
  }

  /**
   * Create an instance of PeMSAggregateDatum object
   * @return PeMSAggregateDatum object
   */
  @Override
  public PeMSAggregateDatum createPeMSAggregateDatum(){
    return new PeMSAggregateDatum();
  }

  /**
   * Create an instance of PeMSAggregateDataProfile object
   * @return PeMSAggregateDataProfile object
   */
  @Override
  public PeMSAggregateDataProfile createPeMSAggregateDataProfile(){
    return new PeMSAggregateDataProfile();
  }

  /**
   * Create an instance of PeMSAggregateDataSet object
   * @return PeMSAggregateDataSet object
   */
  @Override
  public PeMSAggregateDataSet createPeMSAggregateDataSet(){
    return new PeMSAggregateDataSet();
  }

}
