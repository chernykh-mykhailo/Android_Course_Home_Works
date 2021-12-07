package com.chernykh.p091recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val users = createListOfUsers()

        val adapter = Adapter(users)
        recyclerView.adapter = adapter
    }


    private fun createListOfUsers(): List<User> {
        val list = mutableListOf<User>()

        list.add(User("Назовите две группы лиц, которые относятся к категории внутренних злоумышленников. (Выберите два варианта.)\n"
            , "доверенные партнеры\n" +
                    "бывшие сотрудники\n" +
                    "\n"))
        list.add(User("К какому типу относится атака, при которой злоумышленники формируют пакеты, маскируемые под обычный сетевой трафик, и таким образом вмешиваются в работу сети?\n"
            , "подделка пакетов"))
        list.add(User("Назовите категорию, к которой относятся киберпреступники, создающие вредоносное ПО для компрометации компаний посредством кражи данных кредитных карт?\n"
            , "«черные» хакеры"))
        list.add(User("Что следует рекомендовать в качестве основы для создания комплексной системы управления информационной безопасностью в организации?\n",
            "ISO/IEC 27000"))
        list.add(User("К какому типу относятся сети, требующие все больше и больше усилий со стороны специалистов по кибербезопасности из-за распространения концепции BYOD?\n",
            "беспроводные сети\n" +
                    "\n"))
        list.add(User("Специалист по кибербезопасности совместно с сотрудниками подразделения ИТ работает над планом информационной безопасности. Какой набор принципов безопасности следует взять за основу при разработке плана информационной безопасности?\n",
            "конфиденциальность, целостность, доступность"))
        list.add(User("Два дня в неделю сотрудники организации имеют право работать удаленно, находясь дома. Необходимо обеспечить конфиденциальность передаваемых данных. Какую технологию следует применить в данном случае?",
            "VPN"))
        list.add(User("Какая из технологий обеспечивает конфиденциальность данных?\n",
            "шифрование"))
        list.add(User("Киберпреступник отправляет ряд специально подготовленных некорректных пакетов на сервер базы данных. Сервер безуспешно пытается обработать пакеты, что приводит к его сбою. Какую атаку реализует киберпреступник?\n",
            "DoS-атака\n" +
                    "\n"))
        list.add(User("В компании организовали проверку защищенности сети путем тестирования на проникновение. Проверка показала, что в сети присутствует бэкдор. Какие меры следует принять в этой организации, чтобы выяснить, скомпрометирована ли сеть?\n",
            "Проверить системы на наличие неавторизованных учетных записей.\n" +
                    "\n"))
        list.add(User("Проверить системы на наличие неавторизованных учетных записей.\n" +
                "\n" +
                "К какому типу относится атака, при которой сотрудник подключает к сети организации неавторизованное устройство для отслеживания сетевого трафика?\n",
            "прослушивание"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))
        list.add(User("Oleg",
            "Orlov"))

        return list
    }
}
data class User(val question: String, val answer: String)