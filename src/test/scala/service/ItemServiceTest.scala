package service

import model._
import org.scalatest.FunSuite
import service.adminservice.ItemService


class ItemServiceTest extends FunSuite {
  val itemService=new ItemService


  test("testAddNewCoin") {
    assert(itemService.addNewCoin(Admin, Coin(1,1,5))==1)
  }

  test("testAddNewItem") {
  assert(itemService.addNewItem(Admin, Item("Chips",10,5))==1)
    assert(itemService.addNewItem(Admin, Item("Nuts",20,5))==1)
    assert(itemService.addNewItem(Admin, Item("Candies",1,5))==1)

  }

  test("testAddNewNote") {
    assert(itemService.addNewNote(Admin, Note(10,10,5))==1)
  }

  test("testRemoveItem") {
    assert(itemService.removeItem(Admin,"Chips")==1)


  }

}
