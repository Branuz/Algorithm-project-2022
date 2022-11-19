import React, {useState, useEffect} from 'react'
import Box from '@mui/material/Box';
import Grid from '@mui/material/Unstable_Grid2';
import Button from '@mui/material/Button';
import SendIcon from '@mui/icons-material/Send';
import APIService from "./APIService"

export default function FullBorderedGrid() {
    const [gridColor, setGridColor] = useState([])

    const addColor = (e, index) => {
      setGridColor(datas=>({
        ...datas,
        [index]: "Green"
     }))
     console.log(gridColor)
    }

    const sendMap = () => {
      APIService.getAllRecipes(gridColor)
      .then(response => {
       console.log(response["Full Name"])
      })
    }


  return (
    <Box sx={{ flexGrow: 1, p: 2 }}>
      <Grid
        container
        sx={{
          '--Grid-borderWidth': '1px',
          borderTop: 'var(--Grid-borderWidth) solid',
          borderLeft: 'var(--Grid-borderWidth) solid',
          borderColor: 'divider',
          '& > div': {
            borderRight: 'var(--Grid-borderWidth) solid',
            borderBottom: 'var(--Grid-borderWidth) solid',
            borderColor: 'divider',
          },
        }}
      >
        {[...Array(252)].map((_, index) => (
          <Grid key={index} {...{ xs: 1, sm: 1, md: 1, lg: 1 }} minHeight={30}  minWidtht={30} >
             <Button key={index} variant="text" onClick={(e) => addColor(e, index)} sx={{ height: '100%',width: '100%', backgroundColor: gridColor[index] }} ></Button>
          </Grid>
        ))}
      </Grid>
      <Button variant="contained" >Set start point</Button>
      <Button variant="contained" color="error" >Set end point</Button>
      <Button variant="contained" color="success" endIcon={<SendIcon />} onClick={sendMap}>Start search</Button>
    </Box>
  );
}