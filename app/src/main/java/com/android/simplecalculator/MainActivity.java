package com.android.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.ADD);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void subEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.SUB);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void mulEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.MUL);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void divEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.DIV);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void expEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.EXP);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void factorialEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.FACTORIAL);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    public void logaritEvent(View view)
    {
        EditText editText1 = (EditText)findViewById(R.id.editTextNumberOperand1);
        EditText editText2 = (EditText)findViewById(R.id.editTextNumberOperand2);
        EditText editText3 = (EditText)findViewById(R.id.editTextNumberResult);

        String result = Calculator.getInstance().doCalculate(editText1.getText().toString(),editText2.getText().toString(), Calculator.Operator.LOGARIT);
        result = standarlizeResult(result);
        editText3.setText(result);
    }

    private String standarlizeResult(String result)
    {
        if(result.endsWith(".0"))
            result = result.replace(".0", "");
        return result;
    }
}