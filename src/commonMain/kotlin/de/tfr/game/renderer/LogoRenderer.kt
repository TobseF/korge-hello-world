package de.tfr.game.renderer

import com.soywiz.korim.format.ImageData
import com.soywiz.korim.format.readImageData
import com.soywiz.korio.file.std.resourcesVfs
import de.tfr.game.lib.actor.Point

/**
 * Created by tobse on 24.12.2016.
 */
class LogoRenderer(point: Point, val gameFieldSize: Double) : Point by point {
    lateinit var logo: ImageData

    suspend fun init() {
        logo = resourcesVfs["images/hitclack_logo.png"].readImageData()
    }

    fun render() {
        //TODO: logo.draw( x - 200, y + gameFieldSize + 250f)
    }
}