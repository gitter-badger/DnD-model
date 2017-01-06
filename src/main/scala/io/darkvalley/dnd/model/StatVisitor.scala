package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
class StatVisitor extends Visitor[Stat, Modifier] {
  override def visit(x: Visitable[Stat, Modifier]): Iterable[Modifier] = {
    x.accept(this)
  }
}
