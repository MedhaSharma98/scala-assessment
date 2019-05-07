package model

import java.time.LocalDate
import java.util.UUID.randomUUID

case class Request(itemMap:Map[String,Int],cashMap:Map[Money,Int]){

}
