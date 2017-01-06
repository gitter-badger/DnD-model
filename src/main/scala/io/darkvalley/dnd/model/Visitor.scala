package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
//trait Visitor[T, U <: Aggregable[T, Visitable[T, U]]] {
//  def visit(x: Visitable[T, U]): Iterable[U]
//}

trait Visitor[T, U <: Aggregable[T]] {
  def visit(x: Visitable[T, U]): Iterable[U]
}
