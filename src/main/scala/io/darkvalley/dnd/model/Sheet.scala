package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
class Sheet extends Visitable[Stat, Modifier] {
  override def accept(visitor: Visitor[Stat, Modifier]): Iterable[Modifier] = ???
}
