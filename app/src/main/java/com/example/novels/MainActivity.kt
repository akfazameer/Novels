package com.example.novels

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter: ArticleAdapter = ArticleAdapter(getArticles())
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)

    }

    fun getArticles(): List<Article> {
       val articles=ArrayList<Article>()
        articles.add(Article(
           title = "Mushaf",
            author = "By Nimra Ahmed",
            image = R.drawable.mushaf,
            details = "Mushaf\"** is a popular Urdu novel by Nimra Ahmed that revolves around themes of spirituality, faith, personal growth, and the transformative power of the Quran. The word *Mushaf* refers to the physical copy of the Quran, and in this novel, it becomes a central metaphor for inner change.\n" +
                    "\n" +
                    "### Summary:\n" +
                    "\n" +
                    "The protagonist, **Mehmal Ibrahim**, is a young, emotionally neglected girl who lives with her aunt after the death of her parents. Mehmal's life is full of struggles, loneliness, and a deep sense of frustration. Her aunt's household is unsupportive, and she has a distant, cold relationship with her extended family.\n" +
                    "\n" +
                    "Mehmal initially has a rebellious and somewhat careless attitude toward religion and life. She feels lost and disconnected, burdened by the hardships she faces, and seeks refuge in superficial things like material wealth and outward appearances.\n" +
                    "\n" +
                    "One day, Mehmal encounters an old, mysterious woman who hands her a black *Mushaf* (a copy of the Quran). At first, Mehmal is indifferent to it, but gradually, she begins reading the Quran with curiosity. As she delves deeper into the verses, she experiences a spiritual awakening. The *Mushaf* starts to guide her through the difficulties of life, revealing to her the deeper meanings and purpose of existence.\n" +
                    "\n" +
                    "Through the journey of understanding the Quran, Mehmal begins to transform her attitude, finding strength, peace, and clarity. The Quran teaches her about self-worth, patience, and the importance of trusting in God’s plan. She also starts seeing the people around her in a new light, including her estranged relatives, understanding their perspectives and flaws with empathy.\n" +
                    "\n" +
                    "**Themes:**\n" +
                    "- **Faith and Spiritual Growth**: The novel emphasizes the importance of turning to faith in times of difficulty. Mehmal's journey is a testament to how the Quran can guide a person toward inner peace and wisdom.\n" +
                    "- **Power of the Quran**: The *Mushaf* symbolizes the life-altering power of the Quran's message, showing how its teachings can help individuals rise above their trials.\n" +
                    "- **Self-Discovery**: Mehmal's character development showcases the importance of self-reflection and spiritual growth in finding one’s true path.\n" +
                    "\n" +
                    "As Mehmal's understanding of the Quran deepens, her outlook on life, relationships, and herself undergoes a profound transformation, leading her toward a more meaningful and purpose-driven existence.\n" +
                    "\n" +
                    "The novel leaves readers with the message that turning to faith and understanding the spiritual wisdom of the Quran can provide solace, guidance, and strength in the face of life's challenges."


        ))


        articles.add(Article(
            title = "Jannat k Pattay",
            author = "By Nimra Ahmed",
            image = R.drawable.j1,
            details ="\"Jannat Kay Pattay\" by Nimra Ahmed is a blend of romance, spirituality, and suspense, with elements of mystery woven throughout the story. The novel revolves around the life of Haya Suleman, a vibrant and modern young woman, who leads an ordinary life at first. She is well-educated, fashion-conscious, and comes from a wealthy family. Haya’s life takes a sudden turn when she accidentally discovers that her personal information has been leaked online. This incident causes her deep distress and forces her to reconsider her lifestyle.\n" +
                    "\n" +
                    "As the story progresses, Haya receives a scholarship to study in Turkey, where she meets new people and experiences new situations that challenge her beliefs and values. She encounters a mysterious man named Jahan Sikander, who has a complex personality, often shrouded in secrecy. Despite his aloof nature, Haya finds herself drawn to him. Jahan plays a significant role in her spiritual journey, where her faith is tested in various ways. Through her experiences in Turkey, Haya grows as a person, becoming more aware of her faith and Islamic teachings.\n" +
                    "\n" +
                    "Parallel to Haya’s journey is a historical narrative, set in the time of Salahuddin Ayubi and the Crusades, that runs through the novel. The \"leaves of heaven\" or \"Jannat kay Pattay\" refer to secret pieces of knowledge that help guide and influence Haya’s life choices.\n" +
                    "\n" +
                    "The novel explores themes of modesty, the significance of the hijab, and the impact of a more conscious, faith-centered life. Haya’s transformation from a carefree, Westernized girl into a more self-aware, religiously grounded woman is the heart of the story. Throughout her journey, she faces multiple challenges, from dealing with her past, understanding her family dynamics, to navigating the mystery of Jahan’s background.\n" +
                    "\n" +
                    "Ultimately, \"Jannat Kay Pattay\" is a story about self-discovery, faith, and redemption, all wrapped up in an intriguing plot full of twists, with lessons on love, trust, and the power of spirituality."

        ))


        articles.add(Article(
            title = "Maala",
            author = "By Nimra Ahmed",
            image = R.drawable.mala,
            details ="\"Maala\" by Nimra Ahmed is a thought-provoking novel that blends spirituality, relationships, and personal growth. The story revolves around Amal, a young woman with strong religious values and moral beliefs, who strives to live a righteous life. She is intelligent, ambitious, and deeply connected to her faith, but also faces struggles in reconciling her personal desires with the responsibilities she shoulders.\n" +
                    "\n" +
                    "The narrative weaves in several key themes, primarily focusing on the significance of religious teachings in one's life, the concept of patience, the test of faith, and how divine guidance can lead to personal transformation. Amal’s journey is not an easy one; she is tested through various relationships, including family dynamics, friendships, and romantic interests. These interactions often challenge her beliefs and force her to grow.\n" +
                    "\n" +
                    "A central element of the story is Amal’s relationship with her family. Her parents are supportive but traditional, and Amal finds herself navigating the expectations placed on her as a daughter, sister, and a responsible Muslim woman. In her professional life, Amal faces dilemmas between material success and spiritual fulfillment. These challenges heighten when she encounters certain characters that represent opposing values, tempting her to stray from her chosen path.\n" +
                    "\n" +
                    "As Amal’s character develops, she faces moments of doubt, struggles with her faith, and encounters situations where she has to make difficult decisions, often turning to her belief in God for guidance. The novel places great emphasis on Islamic teachings, particularly in handling life’s trials with patience and reliance on God’s will. Through the ups and downs, Amal remains committed to her principles, but not without moments of questioning, which make her a relatable and complex protagonist.\n" +
                    "\n" +
                    "The title \"Maala\" (meaning \"beads\" or \"a string of prayer beads\") symbolizes the interconnectedness of human experiences, where each person’s life is like a bead in the larger string, and how individual actions and faith connect to a greater divine purpose. As the story progresses, Amal learns that every hardship comes with a lesson and that her spiritual journey, while personal, also touches the lives of those around her. \n" +
                    "\n" +
                    "The novel leaves readers with a sense of introspection about their own faith, relationships, and life choices. It emphasizes that true contentment and peace come from trusting in God's plan and aligning one's life with divine guidance, no matter how challenging the circumstances may be."
        ))

        articles.add(Article(
            title = "Namal",
            author = "By Nimra Ahmed",
            image = R.drawable.namal,
            details ="\"Namal\" by Nimra Ahmed is a multifaceted novel that intertwines various themes of love, revenge, justice, and fate. The story revolves around multiple characters, each with their own intricate backstories and motivations, but primarily focuses on two families and their interwoven destinies.\n" +
                    "\n" +
                    "At the core of the story is Faris Ghazi, an ex-army officer who is falsely accused of murdering his stepbrother, Saadi. Despite his innocence, he is imprisoned, and his life takes a dark turn. Saadi's widow, Zumar Yousuf, is a central character, struggling to prove Faris' innocence while seeking justice for her husband. Zumar is a strong, determined woman who grapples with both personal and familial challenges. She finds herself in a constant battle with Hashim Kardaar, a manipulative lawyer who seeks to control Zumar’s life and is indirectly responsible for many of the miseries in their lives. Hashim represents corruption and power in the legal system and uses his influence to destroy those in his way.\n" +
                    "\n" +
                    "Throughout the novel, the characters face moral dilemmas, where revenge and forgiveness are recurring themes. Saadi’s son, Talal, and Zumar’s brother, Saadi's son, become central to the plot as they navigate their own struggles, loyalty, and justice. Love, betrayal, and sacrifice weave through their personal journeys as they try to make sense of their complicated lives.\n" +
                    "\n" +
                    "The novel also delves deeply into Islamic teachings, where verses of the Quran are frequently referenced, guiding the characters’ decisions and shaping the narrative. These spiritual elements give a moral compass to the characters, especially in moments of crisis.\n" +
                    "\n" +
                    "The plot is filled with unexpected twists and mysteries that keep the readers engaged. As secrets from the past are uncovered, the novel shifts between different timelines and perspectives, slowly unraveling the truth behind Saadi’s murder and the larger conspiracy that entangles the characters. The story is not just about individual battles but about the broader quest for justice, truth, and redemption.\n" +
                    "\n" +
                    "The title \"Namal\" is symbolic, referencing a chapter from the Quran about the story of Prophet Solomon and the ants, which draws parallels to the patience and perseverance needed in the characters' lives. In the end, the novel speaks of the inevitability of divine justice, where truth triumphs, but not without sacrifice and hardship."
        ))
        articles.add(Article(
            title = "Mehar",
            author = "By Nimra Ahmed",
            image = R.drawable.mehar,
            details = "Mushaf\"** is a popular Urdu novel by Nimra Ahmed that revolves around themes of spirituality, faith, personal growth, and the transformative power of the Quran. The word *Mushaf* refers to the physical copy of the Quran, and in this novel, it becomes a central metaphor for inner change.\n" +
                    "\n" +
                    "### Summary:\n" +
                    "\n" +
                    "The protagonist, **Mehmal Ibrahim**, is a young, emotionally neglected girl who lives with her aunt after the death of her parents. Mehmal's life is full of struggles, loneliness, and a deep sense of frustration. Her aunt's household is unsupportive, and she has a distant, cold relationship with her extended family.\n" +
                    "\n" +
                    "Mehmal initially has a rebellious and somewhat careless attitude toward religion and life. She feels lost and disconnected, burdened by the hardships she faces, and seeks refuge in superficial things like material wealth and outward appearances.\n" +
                    "\n" +
                    "One day, Mehmal encounters an old, mysterious woman who hands her a black *Mushaf* (a copy of the Quran). At first, Mehmal is indifferent to it, but gradually, she begins reading the Quran with curiosity. As she delves deeper into the verses, she experiences a spiritual awakening. The *Mushaf* starts to guide her through the difficulties of life, revealing to her the deeper meanings and purpose of existence.\n" +
                    "\n" +
                    "Through the journey of understanding the Quran, Mehmal begins to transform her attitude, finding strength, peace, and clarity. The Quran teaches her about self-worth, patience, and the importance of trusting in God’s plan. She also starts seeing the people around her in a new light, including her estranged relatives, understanding their perspectives and flaws with empathy.\n" +
                    "\n" +
                    "**Themes:**\n" +
                    "- **Faith and Spiritual Growth**: The novel emphasizes the importance of turning to faith in times of difficulty. Mehmal's journey is a testament to how the Quran can guide a person toward inner peace and wisdom.\n" +
                    "- **Power of the Quran**: The *Mushaf* symbolizes the life-altering power of the Quran's message, showing how its teachings can help individuals rise above their trials.\n" +
                    "- **Self-Discovery**: Mehmal's character development showcases the importance of self-reflection and spiritual growth in finding one’s true path.\n" +
                    "\n" +
                    "As Mehmal's understanding of the Quran deepens, her outlook on life, relationships, and herself undergoes a profound transformation, leading her toward a more meaningful and purpose-driven existence.\n" +
                    "\n" +
                    "The novel leaves readers with the message that turning to faith and understanding the spiritual wisdom of the Quran can provide solace, guidance, and strength in the face of life's challenges."


        ))


        articles.add(Article(
            title = "Paras",
            author = "By Nimra Ahmed",
            image = R.drawable.paras,
            details = "Mushaf\"** is a popular Urdu novel by Nimra Ahmed that revolves around themes of spirituality, faith, personal growth, and the transformative power of the Quran. The word *Mushaf* refers to the physical copy of the Quran, and in this novel, it becomes a central metaphor for inner change.\n" +
                    "\n" +
                    "### Summary:\n" +
                    "\n" +
                    "The protagonist, **Mehmal Ibrahim**, is a young, emotionally neglected girl who lives with her aunt after the death of her parents. Mehmal's life is full of struggles, loneliness, and a deep sense of frustration. Her aunt's household is unsupportive, and she has a distant, cold relationship with her extended family.\n" +
                    "\n" +
                    "Mehmal initially has a rebellious and somewhat careless attitude toward religion and life. She feels lost and disconnected, burdened by the hardships she faces, and seeks refuge in superficial things like material wealth and outward appearances.\n" +
                    "\n" +
                    "One day, Mehmal encounters an old, mysterious woman who hands her a black *Mushaf* (a copy of the Quran). At first, Mehmal is indifferent to it, but gradually, she begins reading the Quran with curiosity. As she delves deeper into the verses, she experiences a spiritual awakening. The *Mushaf* starts to guide her through the difficulties of life, revealing to her the deeper meanings and purpose of existence.\n" +
                    "\n" +
                    "Through the journey of understanding the Quran, Mehmal begins to transform her attitude, finding strength, peace, and clarity. The Quran teaches her about self-worth, patience, and the importance of trusting in God’s plan. She also starts seeing the people around her in a new light, including her estranged relatives, understanding their perspectives and flaws with empathy.\n" +
                    "\n" +
                    "**Themes:**\n" +
                    "- **Faith and Spiritual Growth**: The novel emphasizes the importance of turning to faith in times of difficulty. Mehmal's journey is a testament to how the Quran can guide a person toward inner peace and wisdom.\n" +
                    "- **Power of the Quran**: The *Mushaf* symbolizes the life-altering power of the Quran's message, showing how its teachings can help individuals rise above their trials.\n" +
                    "- **Self-Discovery**: Mehmal's character development showcases the importance of self-reflection and spiritual growth in finding one’s true path.\n" +
                    "\n" +
                    "As Mehmal's understanding of the Quran deepens, her outlook on life, relationships, and herself undergoes a profound transformation, leading her toward a more meaningful and purpose-driven existence.\n" +
                    "\n" +
                    "The novel leaves readers with the message that turning to faith and understanding the spiritual wisdom of the Quran can provide solace, guidance, and strength in the face of life's challenges."


        ))
        articles.add(Article(
            title = "Pahari ka Qaidi",
            author = "By Nimra Ahmed",
            image = R.drawable.qaidi,
            details = "Mushaf\"** is a popular Urdu novel by Nimra Ahmed that revolves around themes of spirituality, faith, personal growth, and the transformative power of the Quran. The word *Mushaf* refers to the physical copy of the Quran, and in this novel, it becomes a central metaphor for inner change.\n" +
                    "\n" +
                    "### Summary:\n" +
                    "\n" +
                    "The protagonist, **Mehmal Ibrahim**, is a young, emotionally neglected girl who lives with her aunt after the death of her parents. Mehmal's life is full of struggles, loneliness, and a deep sense of frustration. Her aunt's household is unsupportive, and she has a distant, cold relationship with her extended family.\n" +
                    "\n" +
                    "Mehmal initially has a rebellious and somewhat careless attitude toward religion and life. She feels lost and disconnected, burdened by the hardships she faces, and seeks refuge in superficial things like material wealth and outward appearances.\n" +
                    "\n" +
                    "One day, Mehmal encounters an old, mysterious woman who hands her a black *Mushaf* (a copy of the Quran). At first, Mehmal is indifferent to it, but gradually, she begins reading the Quran with curiosity. As she delves deeper into the verses, she experiences a spiritual awakening. The *Mushaf* starts to guide her through the difficulties of life, revealing to her the deeper meanings and purpose of existence.\n" +
                    "\n" +
                    "Through the journey of understanding the Quran, Mehmal begins to transform her attitude, finding strength, peace, and clarity. The Quran teaches her about self-worth, patience, and the importance of trusting in God’s plan. She also starts seeing the people around her in a new light, including her estranged relatives, understanding their perspectives and flaws with empathy.\n" +
                    "\n" +
                    "**Themes:**\n" +
                    "- **Faith and Spiritual Growth**: The novel emphasizes the importance of turning to faith in times of difficulty. Mehmal's journey is a testament to how the Quran can guide a person toward inner peace and wisdom.\n" +
                    "- **Power of the Quran**: The *Mushaf* symbolizes the life-altering power of the Quran's message, showing how its teachings can help individuals rise above their trials.\n" +
                    "- **Self-Discovery**: Mehmal's character development showcases the importance of self-reflection and spiritual growth in finding one’s true path.\n" +
                    "\n" +
                    "As Mehmal's understanding of the Quran deepens, her outlook on life, relationships, and herself undergoes a profound transformation, leading her toward a more meaningful and purpose-driven existence.\n" +
                    "\n" +
                    "The novel leaves readers with the message that turning to faith and understanding the spiritual wisdom of the Quran can provide solace, guidance, and strength in the face of life's challenges."


        ))

        articles.add(Article(
            title = "Mery Khwab mery jugnu",
            author = "By Nimra Ahmed",
            image = R.drawable.jugnu,
            details = "Mushaf\"** is a popular Urdu novel by Nimra Ahmed that revolves around themes of spirituality, faith, personal growth, and the transformative power of the Quran. The word *Mushaf* refers to the physical copy of the Quran, and in this novel, it becomes a central metaphor for inner change.\n" +
                    "\n" +
                    "### Summary:\n" +
                    "\n" +
                    "The protagonist, **Mehmal Ibrahim**, is a young, emotionally neglected girl who lives with her aunt after the death of her parents. Mehmal's life is full of struggles, loneliness, and a deep sense of frustration. Her aunt's household is unsupportive, and she has a distant, cold relationship with her extended family.\n" +
                    "\n" +
                    "Mehmal initially has a rebellious and somewhat careless attitude toward religion and life. She feels lost and disconnected, burdened by the hardships she faces, and seeks refuge in superficial things like material wealth and outward appearances.\n" +
                    "\n" +
                    "One day, Mehmal encounters an old, mysterious woman who hands her a black *Mushaf* (a copy of the Quran). At first, Mehmal is indifferent to it, but gradually, she begins reading the Quran with curiosity. As she delves deeper into the verses, she experiences a spiritual awakening. The *Mushaf* starts to guide her through the difficulties of life, revealing to her the deeper meanings and purpose of existence.\n" +
                    "\n" +
                    "Through the journey of understanding the Quran, Mehmal begins to transform her attitude, finding strength, peace, and clarity. The Quran teaches her about self-worth, patience, and the importance of trusting in God’s plan. She also starts seeing the people around her in a new light, including her estranged relatives, understanding their perspectives and flaws with empathy.\n" +
                    "\n" +
                    "**Themes:**\n" +
                    "- **Faith and Spiritual Growth**: The novel emphasizes the importance of turning to faith in times of difficulty. Mehmal's journey is a testament to how the Quran can guide a person toward inner peace and wisdom.\n" +
                    "- **Power of the Quran**: The *Mushaf* symbolizes the life-altering power of the Quran's message, showing how its teachings can help individuals rise above their trials.\n" +
                    "- **Self-Discovery**: Mehmal's character development showcases the importance of self-reflection and spiritual growth in finding one’s true path.\n" +
                    "\n" +
                    "As Mehmal's understanding of the Quran deepens, her outlook on life, relationships, and herself undergoes a profound transformation, leading her toward a more meaningful and purpose-driven existence.\n" +
                    "\n" +
                    "The novel leaves readers with the message that turning to faith and understanding the spiritual wisdom of the Quran can provide solace, guidance, and strength in the face of life's challenges."


        ))



        return articles
    }
}