package service.customerservice

import model.{Database, Item, Money, Request}

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

  override def cancelRequest(itemMap: Map[String, Int]): Map[Money, Int] = ???

  override def getRequestedItems(request: Request): Unit = {
    val list=request.itemMap.toList.foldLeft(List.empty[Item]) { (acc, i) => Database.itemList.filter(p => p.name equals i._1).head::acc }.reverse
    var orderTotal=calculateOrderToatl(request.itemMap)
    val total=request.cashMap.values.sum




  }

  def calculateOrderToatl(map:Map[String,Int]):Int={
    val list=map.toList.foldLeft(List.empty[Item]) { (acc, i) => Database.itemList.filter(p => p.name equals i._1).head::acc }.reverse
    var orderTotal=0;
    for{
      lst<-list
      requestlist<-map.toList
    }{
      lst match{
        case lst.name equals requestlist._1&&lst.quantity>requestlist._2=>orderTotal+=lst.price*lst.quantity
        case _=> orderTotal+=0
      }
    }
    orderTotal
  }
}
