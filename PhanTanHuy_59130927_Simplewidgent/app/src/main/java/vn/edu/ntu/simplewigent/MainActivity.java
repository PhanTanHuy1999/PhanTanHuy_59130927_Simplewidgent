package vn.edu.ntu.simplewigent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText name, Ns , Sothich ;
   RadioGroup radioGroup ;
   Button xn ;
    CheckBox film, Nhac ,cafe, athome ,cooking;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.ten);
        Ns = (EditText) findViewById(R.id.ngaysinh);
        Sothich = (EditText) findViewById(R.id.sothichkhac);
        film = (CheckBox) findViewById(R.id.phim);
        Nhac = (CheckBox) findViewById(R.id.nhac);
        cafe = (CheckBox) findViewById(R.id.cafe);
        athome = (CheckBox) findViewById(R.id.onhamotminh);
        cooking = (CheckBox) findViewById(R.id.vaobepnauan);
        xn = (Button) findViewById(R.id.ok);
        radioGroup = (RadioGroup)  findViewById(R.id.radioGroup);
        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noichuoi ="";
                noichuoi += "Tên của bạn: "+name.getText().toString();
                noichuoi += "\nNgày sinh của bạn: "+Ns.getText().toString();

                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.ten : noichuoi +="\nGiới tính là nam"; break;
                    case R.id.ngaysinh : noichuoi +="\nGiới tính là nữ"; break;
                }

                noichuoi +="\nSở thích: ";

                if (film.isChecked())
                {
                    noichuoi+= film.getText().toString() +" - ";
                }
                if (Nhac.isChecked())
                { noichuoi+= Nhac.getText().toString() +" - ";
                }
                if (cafe.isChecked())
                {
                    noichuoi+= cafe.getText().toString() +" - ";
                }
                if (athome.isChecked())
                {
                    noichuoi+= athome.getText().toString() +" - ";
                }
                if (cooking.isChecked())
                {
                    noichuoi+= cooking.getText().toString() +" - ";
                }

                noichuoi+=Sothich.getText().toString();

                Toast.makeText(getApplicationContext(),noichuoi, Toast.LENGTH_LONG).show();
            }
        });

    }
}


