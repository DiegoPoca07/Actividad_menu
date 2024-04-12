package diego.rodriguez.menudesplegablediego

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class Fragment_Configuracion : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Creo una variable que es igual a el Fragmet inflado
        //Iinflado significa que esta la vista conectada al codigo
        val root = inflater.inflate(R.layout.fragment__configuracion, container, false)

        //Mnadar a llamar al boton btnigresar
        val btningresar = root.findViewById<Button>(R.id.btningresar)

        btningresar.setOnClickListener {
            //pongo una alerta
            Toast.makeText(context, "Hola mundo", Toast.LENGTH_LONG).show()
        }

        return root
    }



}