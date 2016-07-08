package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";
    //protected int mColorMode;

    /*
    protected EditText mEditText;

    protected Button mRedButton, mGreenButton;
    protected int mColorMode;
    */


    /**
     * метод вызывается при создании активности( после изменения конфигурации. возврата
     * к текущей активности после его уничтожения
     *
     * в данном методе инициализируются. производятся:
     * - ui пользовательский интерфейс( статика)
     * - инициализация статических данных активити
     * - связь данных со списками( инициализация адаптеров)
     *
     * Не запускать длительные операции по работе с данными в onCreate()!!!!
     *
     * @param savedInstanceState - объект со значениями, сохраненными в Bundle -
     *                           состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

       /*
        mRedButton = (Button) findViewById(R.id.red_btn);
        mGreenButton = (Button) findViewById(R.id.green_btn);
        mEditText = (EditText) findViewById(R.id.textView);

        mRedButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);
        */

        if (savedInstanceState == null){

            // активити запускается впервые

        } else {
            // активити уже запускалось

            //mColorMode = savedInstanceState.getInt(ConstantManager.COLOR_MODE_KEY);

           /* if ( mColorMode == Color.RED) {
                mEditText.setBackgroundColor(Color.RED);
            } else if (mColorMode == Color.GREEN){
                mEditText.setBackgroundColor(Color.GREEN);
            }
            */
        }


    }


    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происходит регистрация подписки на события остановка которых
     * была произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");


    }

    /**
     * метод вызывается когда активити становится доступна для взаимодействия
     * в данном методе как правило происходит запуск BroadcastReceiver необходимых для
     * реализации UI логики
     * запуск выполнения потоков и тюпю
     * метод должен быть максимально легковесным  для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    /**
     * метод вызывается когда текущая активити теряет фокус, но остается видимой (всплытие
     * диалогового окна/ частичное перекрытие других активити и т.д.
     * <p/>
     * в данном методе реализуется сохранение легковесных данных/ анимации/ аудио/ видео и т.д.
     */
    @Override

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }


    /**
     * метод вызывается, когда активити становится невидимым для пользователяю
     * в данном методе происходит отписка от событий, остановка сложных анимаций, сложных операций
     * по сохранению данных (прерывание запущенных потоков) и т.п.
     */
    @Override
    protected void onStop() {
        super.onStop();


        Log.d(TAG, "onStop");


    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или
     * после вызова метода finish())
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активити / возобнавлении работы после вызова метода onStop().
     * в данном методе реализуется специфическая бизнес логика, которая должна быть реализована
     * именно при рестарте активити: например, запросы к серверу, которые необходимо вызывать
     * при возвращении из другой активности (обновление данных, подписка на определенные события,
     * проинициализированные на другом экране/ специфическая бизнес логика, завязанная именно
     * на перезапуске активити
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        // switch (v.getId()) {
           /* case R.id.green_btn:
                mEditText.setBackgroundColor(Color.GREEN);
                mColorMode = Color.GREEN;
                break;
            case R.id.red_btn:
                mEditText.setBackgroundColor(Color.RED);
                mColorMode = Color.RED;
                break;
                */
        // }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG,"onSaveInstanceState");
        // outState.putInt(ConstantManager.COLOR_MODE_KEY,mColorMode);

    }
}
