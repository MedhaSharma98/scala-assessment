package service
import model._

class ItemService extends ManageItem {
  override def addNewItem(userType: UserType, item: Item): Int = userType match {
    case Admin=>Database.itemList+=item ;    1
    case _=>0
  }

  override def removeItem(userType: UserType, itemName: String): Int = userType match {
    case Admin=>Database.itemList-=Database.itemList.filter(p => p.name equals itemName).head; 1
    case _=>0
  }

  override def addNewCoin(userType: UserType, coin: Coin): Int = userType match {
    case Admin=>Database.coinList+=coin ;   1
    case _=>0
  }

  override def removeCoin(userType: UserType, coin: Int): Int = userType match {
    case Admin=>Database.coinList-=Database.coinList.filter(p=> p.number == coin).head; 1
    case _=>0
  }

  override def addNewNote(userType: UserType, note: Note): Int = userType match {
    case Admin=>Database.noteList+=note  ;   1
    case _=>0
  }

  override def removeNote(userType: UserType, noteNo: Int): Int = userType match {
    case Admin=>Database.noteList-=Database.noteList.filter(p=>p.number==noteNo).head   ;  1
    case _=>0
  }
}
