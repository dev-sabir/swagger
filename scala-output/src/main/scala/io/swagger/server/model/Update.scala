/**
 * User API
 * OpenAPI Specification for the Apigee user api service endpoint.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model
import java.math.BigDecimal

case class Update(
  userId: Option[BigDecimal],
    firstName: Option[String],
    lastName: Option[String],
    roleId: Option[BigDecimal],
    status: Option[String],
    orgId: Option[BigDecimal]
  )
