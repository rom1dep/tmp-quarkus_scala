package org.acme

import io.quarkus.panache.common.Sort
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.{GET, Path, PathParam}

@Path("hello")
@ApplicationScoped
class HelloResource {
  @GET
  @Path("world")
  def hello() = "hello world"

  @GET
  @Path("{name}")
  def helloName(@PathParam("name") name: String): String = f"Hello $name"

  @GET
  def persons(): List[Person] = Person.listAll(Sort.by("name"))

}
