using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UIElements;
using UnityEngine.UI;

public class DefenderButton : MonoBehaviour
{
    [SerializeField] Defender defenderPrefab;

    private void Start()
    {
        Text costText = GetComponentInChildren<Text>();
        if(!costText)
        {
            return;
        }
        else
        {
            costText.text = defenderPrefab.GetStarCost().ToString();
        }
    }

    private void LabelButtonWithCost()
    {
        throw new NotImplementedException();
    }

    private void OnMouseDown()
    {
        ChangeButtonColor();
        
    }

    private void ChangeButtonColor()
    {
        var buttons = FindObjectsOfType<DefenderButton>();
        foreach(DefenderButton button in buttons)
        {
            button.GetComponent<SpriteRenderer>().color = new Color32(73, 73, 73, 255);
        }

        GetComponent<SpriteRenderer>().color = Color.white;
        FindObjectOfType<DefenderSpawner>().SetSelectedDefender(defenderPrefab);


       
        
    }

    private void Update()
    {
        
    }
}
