using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Tilemaps;

public class VerticalScroll : MonoBehaviour
{
    [Tooltip("Game Units per ssecond")]
    [SerializeField] float verticalSpeedRate = 0.025f;
    // Start is called before the first frame update
    void Start()
    {
        
    }
    


    // Update is called once per frame
    void Update()
    {
        float yMove = verticalSpeedRate * Time.deltaTime;
        transform.Translate(new Vector2(0, yMove));
    }
}
