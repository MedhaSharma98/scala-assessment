package service.customerservice

import model.{Item, Money, Request}


trait CustomerServiceTrait {
  def viewAvailableItemsWithPrice():List[(String,Int)]
  def getSelectedItemPrice(selectedItemList:List[String]):List[(String,Int)]
  def cancelRequest(itemMap:Map[String,Int]):Map[Money,Int]
  def  getRequestedItems(request:Request)

}
