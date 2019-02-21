package de.tfr.game.renderer

import com.soywiz.korge.view.Graphics
import com.soywiz.korge.view.text
import com.soywiz.korim.font.BitmapFont
import com.soywiz.korim.font.readBitmapFont
import com.soywiz.korio.file.std.resourcesVfs
import com.soywiz.korma.geom.Rectangle
import com.soywiz.korma.geom.vector.rect
import de.tfr.game.Display
import de.tfr.game.ui.GRAY_DARK
import de.tfr.game.ui.GREEN_LIGHT
import de.tfr.game.ui.GREEN_LIGHT2
import de.tfr.game.util.extensions.color


class DisplayRenderer(val display: Display) {
    lateinit var font: BitmapFont


    suspend fun init() {
        font = resourcesVfs["fonts/segment7.fnt"].readBitmapFont()
    }

    fun render(renderer: Graphics) {

        renderer.color(GREEN_LIGHT)

        renderer.rect(display.x - display.width / 2, display.y - 510, display.width, display.height)

        renderer.text("88:88", font = font)
        font.color(GRAY_DARK)

        val height = font.lineHeight
        val with = font.base * 5

        renderer.text("88:88", font = font) {
            setTextBounds(Rectangle(display.x - (font.base / 2.0),
                    display.y - 370 - font.lineHeight / 2.0,
                    with,
                    height))
        }
        font.color(GREEN_LIGHT2)

        renderer.text(display.getText(), font = font) {
            setTextBounds(Rectangle(display.x - (font.base / 2.0),
                    display.y - 370 - font.lineHeight / 2.0,
                    with,
                    height))
        }


        /*

         renderer.color = GREEN_LIGHT2
          renderer.setAutoShapeType(true)
          renderer.begin()
          renderer.set(ShapeRenderer.ShapeType.Filled)
          renderer.rect(display.x, display.y, display.width, display.height)
          renderer.end()
          batch.end()
          */
    }


}
