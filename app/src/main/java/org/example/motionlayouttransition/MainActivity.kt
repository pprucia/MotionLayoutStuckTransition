package org.example.motionlayouttransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        collapse.setOnClickListener { collapse() }
        expand.setOnClickListener { expand() }
    }

    private fun collapse() {
        with(container) {
            setTransition(R.id.transition_container_set1_2)
            transitionToEnd {
                setTransition(R.id.transition_container_set2_3)
                transitionToEnd()
            }
        }
    }

    private fun expand() {
        with(container) {
            setTransition(R.id.transition_container_set3_2)
            transitionToEnd {
                setTransition(R.id.transition_container_set2_1)
                transitionToEnd()
            }
        }
    }
}