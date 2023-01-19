package com.back.api.controller;

import com.back.api.model.RoleModel;
import com.back.api.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://localhost:3000/")
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/roles")
    public List<RoleModel> getAllRoles() {
         return roleRepository.getRoles();
    }

    @GetMapping("/role/{roleId}")
    public RoleModel getRoleById(@PathVariable("roleId") Long roleId) {
        return roleRepository.findRole(roleId);
    }

    @PostMapping("/saveRole")
    public int createRole(@RequestBody RoleModel roleModel) {
        return roleRepository.saveRole(roleModel);
    }

    @PutMapping("/updateRole/{roleId}")
    public ResponseEntity<String> updateRole(@PathVariable("roleId") Long roleId, @RequestBody RoleModel roleModel) {
        RoleModel role = roleRepository.findRole(roleId);

        if (role != null) {
            role.setRoleId(roleId);
            role.setRoleFonction(roleModel.getRoleFonction());
            role.setRoleDesc(roleModel.getRoleDesc());

            roleRepository.updateRole(role);
            return new ResponseEntity<>("Role was updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot find role with id=" + roleId, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("deleteRole/{roleId}")
    public int deleteRole(@PathVariable("roleId") Long roleId) {
        return roleRepository.deleteRole(roleId);
    }

    @DeleteMapping("/deleteAllRole")
    public int deleteAllRole() {
        return roleRepository.deleteRoles();
    }
}
