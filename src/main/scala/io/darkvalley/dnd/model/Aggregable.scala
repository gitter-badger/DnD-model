package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
trait Aggregable[T] {

  type Self <: Aggregable[T]

  def aggregate(x: T): T

  def sources(): Iterable[Visitable[T, Self]]
}
