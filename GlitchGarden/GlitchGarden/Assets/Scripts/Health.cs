using System;
using System.Collections;
using System.Collections.Generic;
using UnityEditor;
using UnityEngine;

public class Health : MonoBehaviour
{
    [SerializeField] GameObject deathVFX;
    // [SerializeField] Zucchini attacker;
    [SerializeField] float health = 100f;


    public void DealDamage(float damage)
    {
        health -= damage;
       
        if (health <= 0)
        {
            TriggerHealthVFX();
            Destroy(gameObject);
        }
    }

    private void TriggerHealthVFX()
    {
       if (!deathVFX) { return; }
        GameObject deathVFXObject = Instantiate(deathVFX, transform.position, Quaternion.identity);
        Destroy(deathVFXObject, 1f);
    }
}
