package com.orendainx.hortonworks.trucking.simulator.generators

import akka.actor.Actor
import com.orendainx.hortonworks.trucking.simulator.models.Resource

/**
  * [[DataGenerator]]s are responsible for generating simulation data.
  * They should act on [[com.orendainx.hortonworks.trucking.simulator.generators.DataGenerator.GenerateData]] messages
  * from [[com.orendainx.hortonworks.trucking.simulator.coordinators.GeneratorCoordinator]]s and send back an
  * [[com.orendainx.hortonworks.trucking.simulator.coordinators.GeneratorCoordinator.AcknowledgeTick]] message when the
  * generator is ready to generate more data.
  *
  * Generated data should be sent to a [[com.orendainx.hortonworks.trucking.simulator.flows.FlowManager]] for
  * proper handling.
  *
  * @author Edgar Orendain <edgar@orendainx.com>
  */
object DataGenerator {
  case object GenerateData

  case class NewResource(resource: Resource)
}

trait DataGenerator extends Actor
