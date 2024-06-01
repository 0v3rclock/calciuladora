import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class Calculadora : AppCompatActivity() {

    private lateinit var editText: EditText
    private var num1 = 0.0
    private var num2 = 0.0
    private var resultado = 0.0
    private var operador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)

        val btn0 = findViewById<Button>(R.id.n0)
        val btn1 = findViewById<Button>(R.id.n1)
        val btn2 = findViewById<Button>(R.id.n2)
        val btn3 = findViewById<Button>(R.id.n3)
        val btn4 = findViewById<Button>(R.id.n4)
        val btn5 = findViewById<Button>(R.id.n5)
        val btn6 = findViewById<Button>(R.id.n6)
        val btn7 = findViewById<Button>(R.id.n7)
        val btn8 = findViewById<Button>(R.id.n8)
        val btn9 = findViewById<Button>(R.id.n9)
        val btnPunto = findViewById<Button>(R.id.Punto)
        val btnSumar = findViewById<Button>(R.id.Sumar)
        val btnRestar = findViewById<Button>(R.id.Restar)
        val btnMultiplicar = findViewById<Button>(R.id.Multiplicar)
        val btnDividir = findViewById<Button>(R.id.Dividir)
        val btnIgual = findViewById<Button>(R.id.result)

        btn0.setOnClickListener { editText.setText(editText.text.toString() + "0") }
        btn1.setOnClickListener { editText.setText(editText.text.toString() + "1") }
        btn2.setOnClickListener { editText.setText(editText.text.toString() + "2") }
        btn3.setOnClickListener { editText.setText(editText.text.toString() + "3") }
        btn4.setOnClickListener { editText.setText(editText.text.toString() + "4") }
        btn5.setOnClickListener { editText.setText(editText.text.toString() + "5") }
        btn6.setOnClickListener { editText.setText(editText.text.toString() + "6") }
        btn7.setOnClickListener { editText.setText(editText.text.toString() + "7") }
        btn8.setOnClickListener { editText.setText(editText.text.toString() + "8") }
        btn9.setOnClickListener { editText.setText(editText.text.toString() + "9") }
        btnPunto.setOnClickListener { editText.setText(editText.text.toString() + ".") }

        btnSumar.setOnClickListener {
            num1 = editText.text.toString().toDouble()
            operador = 1
            editText.setText("")
        }

        btnRestar.setOnClickListener {
            num1 = editText.text.toString().toDouble()
            operador = 2
            editText.setText("")
        }

        btnMultiplicar.setOnClickListener {
            num1 = editText.text.toString().toDouble()
            operador = 3
            editText.setText("")
        }

        btnDividir.setOnClickListener {
            num1 = editText.text.toString().toDouble()
            operador = 4
            editText.setText("")
        }

        btnIgual.setOnClickListener {
            num2 = editText.text.toString().toDouble()

            when (operador) {
                1 -> resultado = num1 + num2
                2 -> resultado = num1 - num2
                3 -> resultado = num1 * num2
                4 -> resultado = num1 / num2
            }

            editText.setText(resultado.toString())
        }
    }
}