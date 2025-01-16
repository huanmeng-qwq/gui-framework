dependencies {
    compileOnlyApi("org.checkerframework:checker-qual:3.12.0")

    compileOnlyApi("net.kyori:adventure-api:4.14.0")
    compileOnlyApi("net.kyori:adventure-platform-bukkit:4.3.1")
    compileOnlyApi("net.kyori:adventure-text-serializer-legacy:4.14.0")
    compileOnlyApi("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    compileOnlyApi("com.github.retrooper:packetevents-spigot:2.7.0")
}

tasks.compileJava {
    exclude("**/test/**")
}

tasks.processResources {
    exclude("plugin.yml")
}