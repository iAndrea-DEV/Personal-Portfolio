using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using UnityEngine;

public class AttackerSpawner : MonoBehaviour
{
    
    bool spawn = true;
    [SerializeField] float minTime = 1f;
    [SerializeField] float maxTime = 3.5f;
    [SerializeField] Attacker[] attackerPrefabArray;
    [SerializeField] int numberOfAttackers;

    // Start is called before the first frame update
    IEnumerator Start()
    {


        while(spawn)
        {
            yield return new WaitForSeconds(Random.Range(0.5f, 1.5f));
            SpawnAttacker();

            yield return new WaitForSeconds(Random.Range(minTime, maxTime));
        }
    }

    public void StopSpawning()
    {
        spawn = false;
    }

    private void Spawn(Attacker myAttacker)
    {
        Attacker newAttacker= Instantiate(myAttacker, 
            transform.position, Quaternion.identity) 
            as Attacker;

        newAttacker.transform.parent = transform;

    }

     void SpawnAttacker()
    {

        var attackerIndex = Random.Range(0, attackerPrefabArray.Length);
        Spawn(attackerPrefabArray[attackerIndex]);

        
    }




}

