package service.adminservice

import model.{Coin, Item, Note, UserType}

trait ManageItem {
  def addNewItem(userType:UserType,item:Item):Int
  def removeItem(userType:UserType,itemName:String):Int
  def addNewCoin(userType:UserType,coin:Coin):Int
  def removeCoin(userType:UserType,coinNo:Int):Int
  def addNewNote(userType:UserType,note:Note):Int
  def removeNote(userType:UserType,noteNo:Int):Int

}
