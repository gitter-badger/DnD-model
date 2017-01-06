package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
trait Visitable[T, U <: Aggregable[T]] {


  def accept(visitor: Visitor[T, U]): Iterable[U]
}
