package service.customerservice

import model.{Database, Item}
import scala.collection.mutable

class CustomerService extends CustomerServiceTrait{

  override def viewAvailableItemsWithPrice(): List[(String,Int)] = {
    var list= List.empty[(String,Int)]
      for {
      lst <- Database.itemList
    } {
      lst match {
        case Item(_, _, _) => (lst.name,lst.price)::list
      }
    }
    list

  }

  override def getSelectedItemPrice(selectedItemList:List[String]): List[(String,Int)] = {
    val list = selectedItemList.foldLeft(List.empty[Item]) { (acc, i) => Database.itemList.filter(p => p.name equals i).head :: acc }
    var requiredList = List.empty[(String, Int)]
    for {
      lst <- list
    } {
      lst match {
        case Item(_, _, _) => (lst.name, lst.price) :: requiredList
      }
    }
    requiredList
  }
}
