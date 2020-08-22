using System.Collections;
using System.Collections.Generic;
using System.Net;
using Unity.Collections;
using UnityEngine;

public class Zucchini : MonoBehaviour
{
    [SerializeField] float damage = 50f;
    [SerializeField] float moveSpeed;
    int attackersRemaining;
  
    private void MoveZucchini()
    {
        transform.Translate(Vector2.right * Time.deltaTime * moveSpeed);
    }
    // Update is called once per frame
    void Update()
    {
        MoveZucchini();
    }
    private void OnTriggerEnter2D(Collider2D otherCollider)
    {
        var health = otherCollider.GetComponent<Health>();
        var attacker = otherCollider.GetComponent<Attacker>();

        if (attacker && health)
        {
            health.DealDamage(damage);
            Destroy(gameObject);

           
        }
       
    }
}
 
