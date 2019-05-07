package model

import scala.collection.mutable
object Database {
  var itemList= mutable.ListBuffer.empty[Item]
  var coinList= mutable.ListBuffer.empty[Coin]
  var noteList= mutable.ListBuffer.empty[Note]
}
