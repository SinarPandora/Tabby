package org.lartifa.tabby

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class TabbyApplication

fun main(args: Array<String>) {
	runApplication<TabbyApplication>(*args)
}
