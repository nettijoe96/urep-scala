// package com.urepscala.repository


// // import play.api.libs.json.Json
// // import play.modules.reactivemongo.ReactiveMongoApi
// // import reactivemongo.api.indexes.{Index, IndexType}
// // import reactivemongo.api.{Cursor, ReadPreference}
// // import reactivemongo.play.json._
// // import reactivemongo.play.json.collection.JSONCollection

// //import akka.actor.{ActorSystem, Scheduler}
// import common.formatter.MongoObjectIdFormatter
// import play.api.libs.json.{JsObject, Json, OWrites, Reads}
// import reactivemongo.api.indexes.Index
// import reactivemongo.api.{Cursor, CursorProducer, QueryOpts, ReadPreference}
// import reactivemongo.play.json._
// import reactivemongo.play.json.collection.JSONCollection

// import scala.concurrent.ExecutionContext.Implicits.global
// import scala.concurrent.duration.{Duration, FiniteDuration}
// import scala.concurrent.{Await, Future}
// import scala.concurrent.duration._


// trait Repository[T] extends MongoObjectIdFormatter[T] with IdParser with Guards {

//     def insert(document: T)(implicit writes: OWrites[T], delays: Seq[FiniteDuration] = defaultDelays, retries: Int = defaultRetries): Future[T] = {
//         retryGuard {
//             errorGuard {
//                 successGuard(document)(collection.flatMap(_.insert(document)(mongoWrites(writes), global)))
//             }
//         }
//     }

// }

// // import scala.concurrent.ExecutionContext.Implicits.global
// // import scala.concurrent.Future

// // class BaseHealthRepository(reactiveMongo: ReactiveMongoApi) extends Repository[SchemaHealthFault] {

// //   override protected def indexes: Seq[Index] = Seq(Index(key = Seq("schemaId" -> IndexType.Ascending), name = Some("schemaId"), unique = true))

// //   override protected def collection: Future[JSONCollection] = reactiveMongo.database.map(_.collection[JSONCollection]("health"))


// //   def findBySchemaId(schemaId: String): Future[Option[SchemaHealthFault]] = {
// //     findOne(Json.obj("schemaId" -> schemaId))
// //   }

// //   def findBySchemaIdHealthOnly(schemaId: String): Future[Option[SchemaHealthFault]] = {
// //     findOne(Json.obj("schemaId" -> schemaId), Json.obj("healthFaults.anps.faults" -> 0, "healthFaults.anps.epgs.faults" -> 0, "healthFaults.vrfs.faults" -> 0, "healthFaults.bds.faults" -> 0, "healthFaults.contracts" -> 0, "healthFaults.externalEpgs.faults" -> 0))
// //   }

// //   def findBySchemaIdFaultsOnly(schemaId: String): Future[Option[SchemaHealthFault]] = {
// //     findOne(Json.obj("schemaId" -> schemaId), Json.obj("healthFaults.health" -> 0, "healthFaults.anps.health" -> 0, "healthFaults.anps.epgs.health" -> 0, "healthFaults.vrfs.health" -> 0, "healthFaults.bds.health" -> 0, "healthFaults.externalEpgs.health" -> 0))
// //   }

// //   def summary: Future[Seq[SchemaHealthFault]] = {
// //     collection.flatMap(
// //       _.find(Json.obj(), Json.obj("healthFaults.anps" -> 0, "healthFaults.vrfs" -> 0, "healthFaults.bds" -> 0, "healthFaults.contracts" -> 0, "healthFaults.externalEpgs" -> 0))
// //         .cursor[SchemaHealthFault](ReadPreference.primary).
// //         collect[Seq](-1, Cursor.FailOnError[Seq[SchemaHealthFault]]())
// //     )
// //   }

// //   def deleteBySchemaId(schemaId: String): _root_.scala.concurrent.Future[Unit] =  {
// //     parse(schemaId) { objectId =>
// //       successGuard(()) {
// //         collection.flatMap(_.remove(Json.obj("schemaId" -> objectId.stringify)))
// //       }
// //     }
// //   }

// //   def findObsolete(schemaIds: Seq[String]): Future[Seq[SchemaHealthFault]] = {
// //     findSome(Json.obj("schemaId" -> Json.obj("$nin" -> schemaIds)))
// //   }

// // }
