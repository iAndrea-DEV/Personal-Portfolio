using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Enemy : MonoBehaviour
{
    [Header("Enemy Stats")]

    [SerializeField] float health = 100;
    [SerializeField] int scoreValue = 150;


    [Header("Other")]

     float shotCounter;
    [SerializeField] float minTimeBetweenShots = 0.2f;
    [SerializeField] float maxTimeBetweenShots = 3f;
    [SerializeField] GameObject enemyLaserPrefab;
    [SerializeField] float enemyLaserProjectileSpeed = 10f;
    [SerializeField] GameObject destroyVFX;
    [SerializeField] float durationOfExplosion = 1f;
    

    [Header("Audio")]
    [SerializeField] AudioClip enemyDeath;
    [SerializeField] AudioClip enemyShoot;
    [SerializeField] [Range(0,1)] float deathSoundVolume = 0.75f;
    [SerializeField] [Range(0, 1)] float shootSoundVolume = 0.41f;

    // Start is called before the first frame update
    void Start()
    {
        shotCounter = Random.Range(minTimeBetweenShots, maxTimeBetweenShots);
       
    }

    // Update is called once per frame
    void Update()
    {
        CountDownAndShoot();
    }

    private void CountDownAndShoot()
    {
        shotCounter -= Time.deltaTime;
        if(shotCounter <= 0)
        {
            Fire();
            shotCounter = Random.Range(minTimeBetweenShots, maxTimeBetweenShots);


        }
    }

    private void Fire()
    {
        GameObject enemyLaser = Instantiate(
            enemyLaserPrefab,
            transform.position,
            Quaternion.identity) as GameObject;

        enemyLaser.GetComponent<Rigidbody2D>().velocity = new Vector2(0, -enemyLaserProjectileSpeed);

        AudioSource.PlayClipAtPoint(enemyShoot, Camera.main.transform.position, shootSoundVolume);
    }

    private void OnTriggerEnter2D(Collider2D other)
    {
        DamageDealer damageDealer = other.gameObject.GetComponent<DamageDealer>();
        if (!damageDealer) { return; }
        ProcessHit(damageDealer);
    }

    private void ProcessHit(DamageDealer damageDealer)
    {
        health -= damageDealer.GetDamage();
        damageDealer.Hit();
        if (health <= 0)
        {
            DieEnemy();
        }
    }

    private void DieEnemy()
    {
        FindObjectOfType<GameSession>().AddToScore(scoreValue);
        GameObject explosionVFX = Instantiate(
                   destroyVFX,
                   transform.position,
                   transform.rotation);
        Destroy(explosionVFX, durationOfExplosion);
        Destroy(gameObject);

        AudioSource.PlayClipAtPoint(enemyDeath, Camera.main.transform.position, deathSoundVolume);


    }

}
