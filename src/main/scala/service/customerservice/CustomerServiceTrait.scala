package service.customerservice

import model.Item


trait CustomerServiceTrait {
  def viewAvailableItemsWithPrice():List[(String,Int)]
  def getSelectedItemPrice(selectedItemList:List[String]):List[(String,Int)]

}
