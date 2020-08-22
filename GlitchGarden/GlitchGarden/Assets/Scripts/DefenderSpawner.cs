using System;
using System.Collections;
using System.Collections.Generic;
using System.Net;
//using System.Numerics;
using UnityEngine;

public class DefenderSpawner : MonoBehaviour
{
 
     Defender defender;
    GameObject defenderParent;
    const string DEFENDER_PARENT_NAME = "Defenders";

    private void Start()
    {
        CreateDefenderParent();
    }

    private void CreateDefenderParent()
    {
        defenderParent = GameObject.Find(DEFENDER_PARENT_NAME);
        if (!defenderParent)
        {
            defenderParent = new GameObject(DEFENDER_PARENT_NAME);
        }
    }

    public void OnMouseDown()
    {
        AttempToPlaceDefenderAt(GetSquareClicked());
        
    }

    public void SetSelectedDefender(Defender defenderToSelect)
    {
        defender = defenderToSelect;
    }

    private void AttempToPlaceDefenderAt(Vector2 gridPos)
    {
        var StarDisplay = FindObjectOfType<SchmeclesDisplay>();
        int defenderCost = defender.GetStarCost();

        if(StarDisplay.HaveEnoughStars(defenderCost))
        {
            
            SpawnDefender(gridPos);
            StarDisplay.SpendStars(defenderCost);
        }
    }

    private Vector2 GetSquareClicked()
    {
        Vector2 clickPos = new Vector2(Input.mousePosition.x, Input.mousePosition.y);
        Vector2 worldPos = Camera.main.ScreenToWorldPoint(clickPos);
        Vector2 gridPos = SnapToGrid(worldPos);

        return gridPos;
    }

    private Vector2 SnapToGrid(Vector2 worldPos)
    {
        float newX = Mathf.RoundToInt(worldPos.x);
        float newY = Mathf.RoundToInt(worldPos.y);

        return new Vector2(newX, newY);
    }

    private void SpawnDefender(Vector2 roundedPos)
    {

        Defender newDefender = Instantiate(defender, roundedPos , Quaternion.identity) as Defender;
        newDefender.transform.parent = defenderParent.transform;
        
        
        
    }

  
}
