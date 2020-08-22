using System.Collections;
using System.Collections.Generic;
using System.Dynamic;
using UnityEngine;
using UnityEngine.Assertions.Must;
using UnityEngine.UI;

public class HealthDisplay : MonoBehaviour
{
    Text playerHealth;
    int healthBelowZero = 0;

    Player health;
    // Start is called before the first frame update
    void Start()
    {
        playerHealth = GetComponent<Text>();
        health = FindObjectOfType<Player>();
    }

    // Update is called once per frame
    void Update()
    {
        playerHealth.text = health.GetPlayerHealth().ToString();

        if (health.GetPlayerHealth() < 0)
        {
            playerHealth.text = healthBelowZero.ToString();

        }
    }
}
