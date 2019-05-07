package model

sealed trait UserType

case object Admin extends UserType
case object NonAdmin extends UserType
